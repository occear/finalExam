pragma solidity ^0.4.0;

contract Final{
    // 信誉机构 
    address public bank;
    
    //账单
    struct Receipt{
        uint tag;
        address from;
        address to;
        uint amount;
        string status;
    }
    
    struct lendReceipt{
        uint i;
        mapping(uint => Receipt) lend;
    }
    
    struct oweReceipt{
        uint i;
        mapping(uint => Receipt) owe;
    }
    
    // 公司 
    struct Company{
        string name;
        uint balance;
        uint rank;
        uint i;
        mapping (uint => Receipt) finish;
        mapping (address => lendReceipt) lend;
        mapping (address => oweReceipt) owe;
    }
    
    mapping (address => Company) public company;
    
    function constructor()public{
        bank = msg.sender;
    }
    
    function addCompany(address c, string name,uint balance,uint r) public{
        require(msg.sender == bank);
        Company memory com;
        com.name = name;
        com.balance = balance;
        com.rank = r;
        com.i = 0;
        company[c] = com;
    }
    
    function removeFromLendReceipt(address from, address to, Receipt r) private{
        uint i=r.tag;
        for(;i<company[from].lend[to].i;i++){
            company[from].lend[to].lend[i].tag--;
        }
        company[from].lend[to].i--;
    }
    
    function removeFromOweReceipt(address from, address to, Receipt r) private{
        uint i=r.tag;
        for(;i<company[from].owe[to].i;i++){
            company[from].owe[to].owe[i].tag--;
        }
        company[from].owe[to].i--;
    }
    
    function addToFinishReceipt(address from, address to, Receipt r) private{
        r.status = "finish";
        r.tag = company[from].i;
        company[from].finish[company[from].i] = r;
        company[from].i++;
    }
    
    function addToLendReceipt(address from, address to, Receipt r) private{
        r.status = "lend";
        r.tag = company[from].lend[to].i;
        company[from].lend[to].lend[company[from].lend[to].i] = r;
        company[from].lend[to].i++;
    }
    
    function addToOweReceipt(address from, address to, Receipt r) private{
        r.status = "owe";
        r.tag = company[from].owe[to].i;
        company[from].owe[to].owe[company[from].owe[to].i] = r;
        company[from].owe[to].i++;
    }
    
    //直接支付 
    function sent(address receiver, uint amount)public{
        //require(company[msg.sender].balance == amount , "Your balance is not abundent");
        require(company[msg.sender].balance >= amount);
        company[msg.sender].balance -= amount;
        company[receiver].balance += amount;
        
        Receipt memory r;
        r.from = msg.sender;
        r.to = receiver;
        r.amount = amount;
        addToFinishReceipt(msg.sender,receiver,r);
        addToFinishReceipt(receiver,msg.sender,r);
    }
    
    function financingBank(address receiver, uint amount) public{
        require(company[msg.sender].rank * 1000 >= amount);
        
        Receipt memory r;
        r.from = msg.sender;
        r.to = receiver;
        r.amount = amount;
        addToOweReceipt(msg.sender,receiver,r);
        addToLendReceipt(receiver,msg.sender,r);
    }
    
    function financingReceipt(address from,address receiver, uint amount) public{
        address current = msg.sender;
        uint i=0;
        for(;i<company[current].lend[from].i;++i){
            if(company[current].lend[from].lend[i].amount >= amount)break;
        }
        Receipt r = company[current].lend[from].lend[i];
        
        
        Receipt memory r1;
        r1.from = receiver;
        r1.to = r.to;
        r1.amount = amount;
        addToLendReceipt(receiver,from,r1);
        
        i=0;
        for(;i<company[from].owe[current].i;++i){
            if(company[from].owe[current].owe[i].amount == r.amount){
                break;
            }
        }
        
        r.amount -=amount;
        Receipt memory r2 = company[from].owe[current].owe[i];
        removeFromOweReceipt(from,current,r2);
        r2.amount -= amount;
        addToOweReceipt(from,current,r2);
        r2.to = receiver;
        r2.amount = amount;
        addToOweReceipt(from,receiver,r2);
        
    }
    
    function pay(address from, address to)public{
        require(company[from].owe[to].i > 0);
        Receipt r = company[from].owe[to].owe[0];
        company[from].balance -= r.amount;
        company[to].balance += r.amount;
        removeFromOweReceipt(from,to,r);
        removeFromLendReceipt(to,from,r);
    }
}
