package temp;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.fisco.bcos.channel.client.TransactionSucCallback;
import org.fisco.bcos.web3j.abi.TypeReference;
import org.fisco.bcos.web3j.abi.datatypes.Address;
import org.fisco.bcos.web3j.abi.datatypes.Function;
import org.fisco.bcos.web3j.abi.datatypes.Type;
import org.fisco.bcos.web3j.abi.datatypes.Utf8String;
import org.fisco.bcos.web3j.abi.datatypes.generated.Uint256;
import org.fisco.bcos.web3j.crypto.Credentials;
import org.fisco.bcos.web3j.protocol.Web3j;
import org.fisco.bcos.web3j.protocol.core.RemoteCall;
import org.fisco.bcos.web3j.protocol.core.methods.response.TransactionReceipt;
import org.fisco.bcos.web3j.tuples.generated.Tuple4;
import org.fisco.bcos.web3j.tx.Contract;
import org.fisco.bcos.web3j.tx.TransactionManager;
import org.fisco.bcos.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.fisco.bcos.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version none.
 */
@SuppressWarnings("unchecked")
public class Final extends Contract {
    public static String BINARY = "608060405234801561001057600080fd5b50612188806100206000396000f30060806040526004361061008e576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff1680633bcb2e661461009357806376cdb03b146100e057806390aeee0d1461013757806390fa17bb146101a45780639128b292146101bb578063bd0af85d14610258578063c44f45fe146102bb578063fb416dc41461038c575b600080fd5b34801561009f57600080fd5b506100de600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803590602001909291905050506103d9565b005b3480156100ec57600080fd5b506100f5610567565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34801561014357600080fd5b506101a2600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff1690602001909291908035906020019092919050505061058c565b005b3480156101b057600080fd5b506101b9610bf3565b005b3480156101c757600080fd5b50610256600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803590602001908201803590602001908080601f01602080910402602001604051908101604052809392919081815260200183838082843782019150505050505091929192908035906020019092919080359060200190929190505050610c35565b005b34801561026457600080fd5b506102b9600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610d45565b005b3480156102c757600080fd5b506102fc600480360381019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919050505061120b565b6040518080602001858152602001848152602001838152602001828103825286818151815260200191508051906020019080838360005b8381101561034e578082015181840152602081019050610333565b50505050905090810190601f16801561037b5780820380516001836020036101000a031916815260200191505b509550505050505060405180910390f35b34801561039857600080fd5b506103d7600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803590602001909291905050506112d3565b005b6103e1612032565b81600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600101541015151561043257600080fd5b81600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206001016000828254039250508190555081600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206001016000828254019250508190555033816020019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff168152505082816040019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff1681525050818160600181815250506105573384836113c5565b6105628333836113c5565b505050565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b6000806000610599612032565b6105a1612032565b339450600093505b600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060050160008973ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600001548410156106e25785600160008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060050160008a73ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206001016000868152602001908152602001600020600301541015156106d7576106e2565b8360010193506105a9565b600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060050160008973ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206001016000858152602001908152602001600020925086826020019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff16815250508260020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16826040019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff1681525050858260600181815250506108208789846115fe565b600093505b600160008973ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060000154841015610961578260030154600160008a73ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600101600086815260200190815260200160002060030154141561095657610961565b836001019350610825565b858360030160008282540392505081905550600160008973ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600101600085815260200190815260200160002060a06040519081016040529081600082015481526020016001820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020016002820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200160038201548152602001600482018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610b6b5780601f10610b4057610100808354040283529160200191610b6b565b820191906000526020600020905b815481529060010190602001808311610b4e57829003601f168201915b5050505050815250509050610b81888683611937565b85816060018181510391508181525050610b9c888683611b18565b86816040019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff168152505085816060018181525050610be9888883611b18565b5050505050505050565b336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550565b610c3d61208e565b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16141515610c9857600080fd5b8381600001819052508281602001818152505081816040018181525050600081606001818152505080600160008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000820151816000019080519060200190610d1c9291906120b7565b506020820151816001015560408201518160020155606082015181600301559050505050505050565b600080600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060000154111515610dd757600080fd5b600160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600101600080815260200190815260200160002090508060030154600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600101600082825403925050819055508060030154600160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206001016000828254019250508190555061108d83838360a06040519081016040529081600082015481526020016001820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020016002820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200160038201548152602001600482018054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561107f5780601f106110545761010080835404028352916020019161107f565b820191906000526020600020905b81548152906001019060200180831161106257829003601f168201915b505050505081525050611937565b61120682848360a06040519081016040529081600082015481526020016001820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020016002820160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200160038201548152602001600482018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156111f85780601f106111cd576101008083540402835291602001916111f8565b820191906000526020600020905b8154815290600101906020018083116111db57829003601f168201915b505050505081525050611e51565b505050565b6001602052806000526040600020600091509050806000018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156112b75780601f1061128c576101008083540402835291602001916112b7565b820191906000526020600020905b81548152906001019060200180831161129a57829003601f168201915b5050505050908060010154908060020154908060030154905084565b6112db612032565b816103e8600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060020154021015151561133057600080fd5b33816020019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff168152505082816040019073ffffffffffffffffffffffffffffffffffffffff16908173ffffffffffffffffffffffffffffffffffffffff1681525050818160600181815250506113b5338483611b18565b6113c08333836115fe565b505050565b6040805190810160405280600681526020017f66696e69736800000000000000000000000000000000000000000000000000008152508160800181905250600160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206003015481600001818152505080600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206004016000600160008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206003015481526020019081526020016000206000820151816000015560208201518160010160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506060820151816003015560808201518160040190805190602001906115a39291906120b7565b50905050600160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060030160008154809291906001019190505550505050565b6040805190810160405280600481526020017f6c656e64000000000000000000000000000000000000000000000000000000008152508160800181905250600160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060050160008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000015481600001818152505080600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060050160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206001016000600160008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060050160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000015481526020019081526020016000206000820151816000015560208201518160010160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060608201518160030155608082015181600401908051906020019061189c9291906120b7565b50905050600160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060050160008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060000160008154809291906001019190505550505050565b6000816000015190505b600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060000154811015611a7f57600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600101600082815260200190815260200160002060000160008154809291906001900391905055508080600101915050611941565b600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600001600081548092919060019003919050555050505050565b6040805190810160405280600381526020017f6f776500000000000000000000000000000000000000000000000000000000008152508160800181905250600160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000015481600001818152505080600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206001016000600160008773ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206000015481526020019081526020016000206000820151816000015560208201518160010160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550606082015181600301556080820151816004019080519060200190611db69291906120b7565b50905050600160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060060160008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060000160008154809291906001019190505550505050565b6000816000015190505b600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060050160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060000154811015611f9957600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060050160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600101600082815260200190815260200160002060000160008154809291906001900391905055508080600101915050611e5b565b600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060050160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020600001600081548092919060019003919050555050505050565b60a06040519081016040528060008152602001600073ffffffffffffffffffffffffffffffffffffffff168152602001600073ffffffffffffffffffffffffffffffffffffffff16815260200160008152602001606081525090565b608060405190810160405280606081526020016000815260200160008152602001600081525090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106120f857805160ff1916838001178555612126565b82800160010185558215612126579182015b8281111561212557825182559160200191906001019061210a565b5b5090506121339190612137565b5090565b61215991905b8082111561215557600081600090555060010161213d565b5090565b905600a165627a7a7230582071c9fa31f18eb8901a2ccd295b80beb9e660fe4c27f7b049d40c02b7406f32b20029";

    public static final String ABI = "[{\"constant\":false,\"inputs\":[{\"name\":\"receiver\",\"type\":\"address\"},{\"name\":\"amount\",\"type\":\"uint256\"}],\"name\":\"sent\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"bank\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"receiver\",\"type\":\"address\"},{\"name\":\"amount\",\"type\":\"uint256\"}],\"name\":\"financingReceipt\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[],\"name\":\"constructor\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"c\",\"type\":\"address\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"balance\",\"type\":\"uint256\"},{\"name\":\"r\",\"type\":\"uint256\"}],\"name\":\"addCompany\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"}],\"name\":\"pay\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"address\"}],\"name\":\"company\",\"outputs\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"balance\",\"type\":\"uint256\"},{\"name\":\"rank\",\"type\":\"uint256\"},{\"name\":\"i\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"receiver\",\"type\":\"address\"},{\"name\":\"amount\",\"type\":\"uint256\"}],\"name\":\"financingBank\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"}]";

    public static final String FUNC_SENT = "sent";

    public static final String FUNC_BANK = "bank";

    public static final String FUNC_FINANCINGRECEIPT = "financingReceipt";

    public static final String FUNC_CONSTRUCTOR = "constructor";

    public static final String FUNC_ADDCOMPANY = "addCompany";

    public static final String FUNC_PAY = "pay";

    public static final String FUNC_COMPANY = "company";

    public static final String FUNC_FINANCINGBANK = "financingBank";

    @Deprecated
    protected Final(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Final(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Final(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Final(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> sent(String receiver, BigInteger amount) {
        final Function function = new Function(
                FUNC_SENT, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(receiver), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void sent(String receiver, BigInteger amount, TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_SENT, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(receiver), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String sentSeq(String receiver, BigInteger amount) {
        final Function function = new Function(
                FUNC_SENT, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(receiver), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public RemoteCall<String> bank() {
        final Function function = new Function(FUNC_BANK, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> financingReceipt(String from, String receiver, BigInteger amount) {
        final Function function = new Function(
                FUNC_FINANCINGRECEIPT, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(from), 
                new org.fisco.bcos.web3j.abi.datatypes.Address(receiver), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void financingReceipt(String from, String receiver, BigInteger amount, TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_FINANCINGRECEIPT, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(from), 
                new org.fisco.bcos.web3j.abi.datatypes.Address(receiver), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String financingReceiptSeq(String from, String receiver, BigInteger amount) {
        final Function function = new Function(
                FUNC_FINANCINGRECEIPT, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(from), 
                new org.fisco.bcos.web3j.abi.datatypes.Address(receiver), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public RemoteCall<TransactionReceipt> constructor() {
        final Function function = new Function(
                FUNC_CONSTRUCTOR, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void constructor(TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_CONSTRUCTOR, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String constructorSeq() {
        final Function function = new Function(
                FUNC_CONSTRUCTOR, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public RemoteCall<TransactionReceipt> addCompany(String c, String name, BigInteger balance, BigInteger r) {
        final Function function = new Function(
                FUNC_ADDCOMPANY, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(c), 
                new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(balance), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(r)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void addCompany(String c, String name, BigInteger balance, BigInteger r, TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_ADDCOMPANY, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(c), 
                new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(balance), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(r)), 
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String addCompanySeq(String c, String name, BigInteger balance, BigInteger r) {
        final Function function = new Function(
                FUNC_ADDCOMPANY, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(c), 
                new org.fisco.bcos.web3j.abi.datatypes.Utf8String(name), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(balance), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(r)), 
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public RemoteCall<TransactionReceipt> pay(String from, String to) {
        final Function function = new Function(
                FUNC_PAY, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(from), 
                new org.fisco.bcos.web3j.abi.datatypes.Address(to)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void pay(String from, String to, TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_PAY, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(from), 
                new org.fisco.bcos.web3j.abi.datatypes.Address(to)), 
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String paySeq(String from, String to) {
        final Function function = new Function(
                FUNC_PAY, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(from), 
                new org.fisco.bcos.web3j.abi.datatypes.Address(to)), 
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    public RemoteCall<Tuple4<String, BigInteger, BigInteger, BigInteger>> company(String param0) {
        final Function function = new Function(FUNC_COMPANY, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return new RemoteCall<Tuple4<String, BigInteger, BigInteger, BigInteger>>(
                new Callable<Tuple4<String, BigInteger, BigInteger, BigInteger>>() {
                    @Override
                    public Tuple4<String, BigInteger, BigInteger, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple4<String, BigInteger, BigInteger, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue(), 
                                (BigInteger) results.get(2).getValue(), 
                                (BigInteger) results.get(3).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> financingBank(String receiver, BigInteger amount) {
        final Function function = new Function(
                FUNC_FINANCINGBANK, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(receiver), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public void financingBank(String receiver, BigInteger amount, TransactionSucCallback callback) {
        final Function function = new Function(
                FUNC_FINANCINGBANK, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(receiver), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        asyncExecuteTransaction(function, callback);
    }

    public String financingBankSeq(String receiver, BigInteger amount) {
        final Function function = new Function(
                FUNC_FINANCINGBANK, 
                Arrays.<Type>asList(new org.fisco.bcos.web3j.abi.datatypes.Address(receiver), 
                new org.fisco.bcos.web3j.abi.datatypes.generated.Uint256(amount)), 
                Collections.<TypeReference<?>>emptyList());
        return createTransactionSeq(function);
    }

    @Deprecated
    public static Final load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Final(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Final load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Final(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Final load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Final(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Final load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Final(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Final> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Final.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Final> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Final.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Final> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Final.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Final> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Final.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
