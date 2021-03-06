package io.stormbird.token.management.contracts.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.6.0.
 */
public class Meetup extends Contract {
    private static final String BINARY = "6080604081905260006005556007805460ff19169055600d80547f737061776e50617373546f2875696e743235362c75696e743235365b5d2c75699092527f6e74382c627974657333322c627974657333322c61646472657373290000000060a05263ffffffff199091166370a082311767ffffffff000000001916677a2307910000000017604060020a63ffffffff0219166b015a0488000000000000000017606060020a63ffffffff0219166f4bd13cdd000000000000000000000000179055348015620000ce57600080fd5b5060405162002396380380620023968339810160409081528151602080840151838501516060860151608087015160a088015160c089015160e08a01516101008b01516101208c015160038054600160a060020a03808c16600160a060020a03199283161790925560048054838c16921691909117905587166000908152808b529b909b20998c018051909c989b979a9699958901989485019793850196928501959185019493909301926200018892918d01906200021d565b5085516200019e90600b9060208901906200026d565b508451620001b490600a9060208801906200026d565b508351620001ca9060099060208701906200026d565b508251620001e09060089060208601906200026d565b508151620001f690600c9060208501906200026d565b5080516200020c9060069060208401906200026d565b5050505050505050505050620002ff565b8280548282559060005260206000209081019282156200025b579160200282015b828111156200025b5782518255916020019190600101906200023e565b5062000269929150620002df565b5090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10620002b057805160ff19168380011785556200025b565b828001600101855582156200025b57918201828111156200025b5782518255916020019190600101906200023e565b620002fc91905b80821115620002695760008155600101620002e6565b90565b612087806200030f6000396000f3006080604052600436106101a85763ffffffff60e060020a600035041663015a048881146101ad57806301ffc9a71461022657806302218bc51461025c57806306fdde03146102e9578063139cea1c146102fe578063150704011461031657806316e4cbf91461032b5780631bb750821461035c5780632b4e4e96146103745780633095c1ad146103d7578063313ce5671461040157806331bfee0a1461042c57806340c1b7ad1461044157806344c9af281461045957806348dec51d146104715780634bd13cdd146105045780634f452b9a1461056e57806370a082311461058357806372c5cb63146105f457806374196626146106095780637a2307911461061e5780637e5374861461067a5780637f9f7f3d1461068f57806395d89b41146106a4578063a75186c7146106b9578063aba7786b1461074c578063b961de44146107a5578063bb6e7de914610838578063c19d93fb1461084d578063c9116b6914610862578063cf0b41a314610877578063d9548e53146108cc578063e7dc3336146108e4578063f0141d84146108f9578063f6be7ed31461090e578063fe60ebdc146109a1575b600080fd5b3480156101b957600080fd5b50604080516020600460248035828101358481028087018601909752808652610224968435963696604495919490910192918291850190849080828437509497505050833560ff16945050506020820135916040810135915060600135600160a060020a0316610a0c565b005b34801561023257600080fd5b50610248600160e060020a031960043516610c52565b604080519115158252519081900360200190f35b34801561026857600080fd5b50610274600435610d08565b6040805160208082528351818301528351919283929083019185019080838360005b838110156102ae578181015183820152602001610296565b50505050905090810190601f1680156102db5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b3480156102f557600080fd5b50610274610da0565b34801561030a57600080fd5b50610274600435610e37565b34801561032257600080fd5b50610274610e98565b34801561033757600080fd5b50610340610ef9565b60408051600160a060020a039092168252519081900360200190f35b34801561036857600080fd5b50610248600435610f08565b34801561038057600080fd5b50604080516020600460248035828101358481028087018601909752808652610224968435600160a060020a031696369660449591949091019291829185019084908082843750949750610f539650505050505050565b3480156103e357600080fd5b506103ef60043561106f565b60408051918252519081900360200190f35b34801561040d57600080fd5b5061041661108e565b6040805160ff9092168252519081900360200190f35b34801561043857600080fd5b50610340611093565b34801561044d57600080fd5b50610274600435611097565b34801561046557600080fd5b506102746004356110f8565b34801561047d57600080fd5b50604080516020600480358082013583810280860185019096528085526102749536959394602494938501929182918501908490808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497506111599650505050505050565b604080516020600460248035828101358481028087018601909752808652610224968435963696604495919490910192918291850190849080828437509497505050833560ff16945050506020820135916040810135915060600135600160a060020a031661118d565b34801561057a57600080fd5b50610248611312565b34801561058f57600080fd5b506105a4600160a060020a0360043516611317565b60408051602080825283518183015283519192839290830191858101910280838360005b838110156105e05781810151838201526020016105c8565b505050509050019250505060405180910390f35b34801561060057600080fd5b506103ef611380565b34801561061557600080fd5b50610274611386565b604080516020600460248035828101358481028087018601909752808652610224968435963696604495919490910192918291850190849080828437509497505050833560ff1694505050602082013591604001359050611414565b34801561068657600080fd5b5061034061166d565b34801561069b57600080fd5b5061027461167c565b3480156106b057600080fd5b506102746116d7565b3480156106c557600080fd5b50604080516020600480358082013583810280860185019096528085526102749536959394602494938501929182918501908490808284375050604080516020601f89358b018035918201839004830284018301909452808352979a9998810197919650918201945092508291508401838280828437509497506117329650505050505050565b34801561075857600080fd5b50604080516020600480358082013583810280860185019096528085526102249536959394602494938501929182918501908490808284375094975050505091351515925061175f915050565b3480156107b157600080fd5b50604080516020600480358082013583810280860185019096528085526102749536959394602494938501929182918501908490808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375094975061178a9650505050505050565b34801561084457600080fd5b506102246117b7565b34801561085957600080fd5b506102746117dc565b34801561086e57600080fd5b506105a4611837565b34801561088357600080fd5b5060408051602060048035808201358381028086018501909652808552610224953695939460249493850192918291850190849080828437509497506118959650505050505050565b3480156108d857600080fd5b50610248600435611912565b3480156108f057600080fd5b5061027461191c565b34801561090557600080fd5b506103ef611977565b34801561091a57600080fd5b50604080516020600480358082013583810280860185019096528085526102749536959394602494938501929182918501908490808284375050604080516020601f89358b018035918201839004830284018301909452808352979a99988101979196509182019450925082915084018382808284375094975061197c9650505050505050565b3480156109ad57600080fd5b506040805160206004604435818101358381028086018501909652808552610224958335600160a060020a0390811696602480359092169636969560649592949301928291850190849080828437509497506119a99650505050505050565b6004546000908190819081908190600160a060020a03163314610a2e57600080fd5b428b1180610a3a57508a155b1515610a4557600080fd5b610a5160008c8c611b01565b604080516000808252602080830180855285905260ff8e1683850152606083018d9052608083018c9052925193985060019360a08084019493601f19830193908390039091019190865af1158015610aad573d6000803e3d6000fd5b505050602060405103519350600092505b8951831015610ba3578983815181101515610ad557fe5b6020908102909101810151600160a060020a0386166000908152918290526040822080549194509084908110610b0757fe5b906000526020600020015414151515610b1c57fe5b600160a060020a0384166000908152602081905260409020805483908110610b4057fe5b6000918252602080832090910154600160a060020a03808a1684528383526040808520805460018101825590865293852090930182905587168352912080549192509083908110610b8d57fe5b6000918252602082200155600190920191610abe565b6040805160ff8b166020808301919091529181018a90526060810189905260808082528c51908201528b51600160a060020a038916927fcf7370598f037d339864eec2202ca184ad6af5b4a0f56335d83f97ed76bafcc0928e928e928e928e929091829160a0830191808901910280838360005b83811015610c2f578181015183820152602001610c17565b505050509050019550505050505060405180910390a25050505050505050505050565b600d54600090600160e060020a031983811660e060020a909202161480610c965750600d54640100000000900460e060020a02600160e060020a0319908116908316145b80610cc25750600d5468010000000000000000900460e060020a02600160e060020a0319908116908316145b80610cf25750600d546c01000000000000000000000000900460e060020a02600160e060020a0319908116908316145b15610cff57506001610d03565b5060005b919050565b60098054604080516020601f6002600019610100600188161502019095169490940493840181900481028201810190925282815260609390929091830182828015610d945780601f10610d6957610100808354040283529160200191610d94565b820191906000526020600020905b815481529060010190602001808311610d7757829003601f168201915b50505050509050919050565b60068054604080516020601f6002600019610100600188161502019095169490940493840181900481028201810190925282815260609390929091830182828015610e2c5780601f10610e0157610100808354040283529160200191610e2c565b820191906000526020600020905b815481529060010190602001808311610e0f57829003601f168201915b505050505090505b90565b600b8054604080516020601f6002600019610100600188161502019095169490940493840181900481028201810190925282815260609390929091830182828015610d945780601f10610d6957610100808354040283529160200191610d94565b600c8054604080516020601f6002600019610100600188161502019095169490940493840181900481028201810190925282815260609390929091830182828015610e2c5780601f10610e0157610100808354040283529160200191610e2c565b600454600160a060020a031681565b6000805b600154811015610f485782600182815481101515610f2657fe5b90600052602060002001541415610f405760019150610f4d565b600101610f0c565b600091505b50919050565b6000805b8251821015611029578282815181101515610f6e57fe5b6020908102909101810151336000908152918290526040822080549193509083908110610f9757fe5b906000526020600020015414151515610faf57600080fd5b600160a060020a0384166000908152602081905260408082203383529120805483908110610fd957fe5b6000918252602080832090910154835460018101855593835281832090930192909255338152908190526040902080548290811061101357fe5b6000918252602082200155600190910190610f57565b82516040805191825251600160a060020a038616917f69ca02dd4edd7bf0a4abb9ed3b7af3f14778db5d61921c7dc7cd545266326de2919081900360200190a250505050565b600180548290811061107d57fe5b600091825260209091200154905081565b600081565b3090565b600a8054604080516020601f6002600019610100600188161502019095169490940493840181900481028201810190925282815260609390929091830182828015610d945780601f10610d6957610100808354040283529160200191610d94565b60088054604080516020601f6002600019610100600188161502019095169490940493840181900481028201810190925282815260609390929091830182828015610d945780601f10610d6957610100808354040283529160200191610d94565b600354606090600160a060020a0316331461117357600080fd5b8151611186906009906020850190611fc3565b5092915050565b60008060004289118061119e575088155b15156111a957600080fd5b6111b4348a8a611d91565b604080516000808252602080830180855285905260ff8c1683850152606083018b9052608083018a9052925193965060019360a08084019493601f19830193908390039091019190865af1158015611210573d6000803e3d6000fd5b5050604051601f190151600354909350600160a060020a03808516911614905061123957600080fd5b60008581526002602052604090205460ff161561125557600080fd5b5060005b875181101561130757611282888281518110151561127357fe5b90602001906020020151610f08565b15156112ff57600160a060020a038416600090815260208190526040902088518990839081106112ae57fe5b60209081029091018101518254600181810185556000948552929093209092019190915588518990839081106112e057fe5b6020908102909101810151825460018101845560009384529190922001555b600101611259565b505050505050505050565b600190565b600160a060020a03811660009081526020818152604091829020805483518184028101840190945280845260609392830182828015610d9457602002820191906000526020600020905b8154815260200190600101908083116113615750505050509050919050565b60055490565b600a805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152929183018282801561140c5780601f106113e15761010080835404028352916020019161140c565b820191906000526020600020905b8154815290600101906020018083116113ef57829003601f168201915b505050505081565b60008060008042891180611426575088155b151561143157600080fd5b61143c348a8a611b01565b604080516000808252602080830180855285905260ff8c1683850152606083018b9052608083018a9052925193975060019360a08084019493601f19830193908390039091019190865af1158015611498573d6000803e3d6000fd5b505050602060405103519250600091505b875182101561158a5787828151811015156114c057fe5b6020908102909101810151600160a060020a03851660009081529182905260408220805491935090839081106114f257fe5b90600052602060002001541415151561150757fe5b33600090815260208190526040808220600160a060020a0386168352912080548390811061153157fe5b6000918252602080832090910154835460018101855593835281832090930192909255600160a060020a0385168152908190526040902080548290811061157457fe5b60009182526020822001556001909101906114a9565b604051600160a060020a038416903480156108fc02916000818181858888f193505050501580156115bf573d6000803e3d6000fd5b506040805160ff89166020808301919091529181018890526060810187905260808082528a51908201528951600160a060020a038616927f951553379d49c26bc057f41de147adc24a09bda33b6b23374354bfbfb96edae8928c928c928c928c929091829160a0830191808901910280838360005b8381101561164c578181015183820152602001611634565b505050509050019550505050505060405180910390a2505050505050505050565b600354600160a060020a031681565b6009805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152929183018282801561140c5780601f106113e15761010080835404028352916020019161140c565b600c805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152929183018282801561140c5780601f106113e15761010080835404028352916020019161140c565b600354606090600160a060020a0316331461174c57600080fd5b8151611186906008906020850190611fc3565b600354600160a060020a0316331461177657600080fd5b6007805460ff191691151591909117905550565b600354606090600160a060020a031633146117a457600080fd5b815161118690600b906020850190611fc3565b600354600160a060020a031633146117ce57600080fd5b600354600160a060020a0316ff5b6008805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152929183018282801561140c5780601f106113e15761010080835404028352916020019161140c565b3360009081526020818152604091829020805483518184028101840190945280845260609392830182828015610e2c57602002820191906000526020600020905b815481526020019060010190808311611878575050505050905090565b600354600090600160a060020a031633146118af57600080fd5b5060005b815181101561190e57600354600160a060020a0316600090815260208190526040902082518390839081106118e457fe5b602090810290910181015182546001818101855560009485529290932090920191909155016118b3565b5050565b5060075460ff1690565b600b805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152929183018282801561140c5780601f106113e15761010080835404028352916020019161140c565b600090565b600354606090600160a060020a0316331461199657600080fd5b815161118690600a906020850190611fc3565b6003546000908190600160a060020a031633146119c557600080fd5b600091505b8251821015611aae5782828151811015156119e157fe5b6020908102909101810151600160a060020a0387166000908152918290526040822080549193509083908110611a1357fe5b906000526020600020015414151515611a2b57600080fd5b600160a060020a0384166000908152602081905260408082203383529120805483908110611a5557fe5b6000918252602080832090910154835460018101855593835281832090930192909255600160a060020a03871681529081905260409020805482908110611a9857fe5b60009182526020822001556001909101906119ca565b83600160a060020a031685600160a060020a03167fc0d84ce5c7ff9ca21adb0f8436ff3f4951b4bb78c4e2fae2b6837958b3946ffd85516040518082815260200191505060405180910390a35050505050565b6000606060008084516002026054016040519080825280601f01601f191660200182016040528015611b3d578160200160208202803883390190505b509250611b48611093565b9150600090505b6020811015611b905782516008820260020a880290849083908110611b7057fe5b906020010190600160f860020a031916908160001a905350600101611b4f565b5060005b6020811015611bd85782516008820260020a870290849060208401908110611bb857fe5b906020010190600160f860020a031916908160001a905350600101611b94565b5060005b6014811015611c3e5782516008820260020a6bffffffffffffffffffffffff196c010000000000000000000000008502160290849060408401908110611c1e57fe5b906020010190600160f860020a031916908160001a905350600101611bdc565b5060005b8451811015611d2a5760088582815181101515611c5b57fe5b906020019060200201519060020a90047f0100000000000000000000000000000000000000000000000000000000000000028382600202605401815181101515611ca157fe5b906020010190600160f860020a031916908160001a9053508481815181101515611cc757fe5b906020019060200201517f0100000000000000000000000000000000000000000000000000000000000000028382600202605401600101815181101515611d0a57fe5b906020010190600160f860020a031916908160001a905350600101611c42565b826040518082805190602001908083835b60208310611d5a5780518252601f199092019160209182019101611d3b565b5181516020939093036101000a600019018019909116921691909117905260405192018290039091209a9950505050505050505050565b60006060600080600085516020026054016040519080825280601f01601f191660200182016040528015611dcf578160200160208202803883390190505b509350611dda611093565b9250600091505b6020821015611e255783516008830260020a890290859084908110611e0257fe5b906020010190600160f860020a031916908160001a905350600190910190611de1565b600091505b6020821015611e715783516008830260020a880290859060208501908110611e4e57fe5b906020010190600160f860020a031916908160001a905350600190910190611e2a565b600091505b6014821015611edb5783516008830260020a6bffffffffffffffffffffffff196c010000000000000000000000008602160290859060408501908110611eb857fe5b906020010190600160f860020a031916908160001a905350600190910190611e76565b600091505b8551821015611f5b575060005b6020811015611f5057806008028683815181101515611f0857fe5b906020019060200201519060020a0260010284828460200260540101815181101515611f3057fe5b906020010190600160f860020a031916908160001a905350600101611eed565b600190910190611ee0565b836040518082805190602001908083835b60208310611f8b5780518252601f199092019160209182019101611f6c565b5181516020939093036101000a600019018019909116921691909117905260405192018290039091209b9a5050505050505050505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061200457805160ff1916838001178555612031565b82800160010185558215612031579182015b82811115612031578251825591602001919060010190612016565b5061203d929150612041565b5090565b610e3491905b8082111561203d57600081556001016120475600a165627a7a72305820456f577a946ab7078b22de167f375988e60514eebb809168a3121eb3cafb78eb0029";

    public static final String FUNC_PASSTO = "passTo";

    public static final String FUNC_SUPPORTSINTERFACE = "supportsInterface";

    public static final String FUNC_GETLOCALITY = "getLocality";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_GETBUILDINGNAME = "getBuildingName";

    public static final String FUNC_GETSYMBOL = "getSymbol";

    public static final String FUNC_PAYMASTER = "paymaster";

    public static final String FUNC_SPAWNED = "spawned";

    public static final String FUNC_TRANSFER = "transfer";

    public static final String FUNC_SPAWNEDTICKETS = "spawnedTickets";

    public static final String FUNC_DECIMALS = "decimals";

    public static final String FUNC_GETTHISCONTRACTADDRESS = "getThisContractAddress";

    public static final String FUNC_GETSTREET = "getStreet";

    public static final String FUNC_GETSTATE = "getState";

    public static final String FUNC_SETLOCALITY = "setLocality";

    public static final String FUNC_SPAWNPASSTO = "spawnPassTo";

    public static final String FUNC_ISSTORMBIRDCONTRACT = "isStormBirdContract";

    public static final String FUNC_BALANCEOF = "balanceOf";

    public static final String FUNC_GETAMOUNTTRANSFERRED = "getAmountTransferred";

    public static final String FUNC_STREET = "street";

    public static final String FUNC_TRADE = "trade";

    public static final String FUNC_ORGANISER = "organiser";

    public static final String FUNC_LOCALITY = "locality";

    public static final String FUNC_SYMBOL = "symbol";

    public static final String FUNC_SETSTATE = "setState";

    public static final String FUNC_SETEXPIRED = "setExpired";

    public static final String FUNC_SETBUILDING = "setBuilding";

    public static final String FUNC_ENDCONTRACT = "endContract";

    public static final String FUNC_STATE = "state";

    public static final String FUNC_MYBALANCE = "myBalance";

    public static final String FUNC_LOADNEWTICKETS = "loadNewTickets";

    public static final String FUNC_ISEXPIRED = "isExpired";

    public static final String FUNC_BUILDING = "building";

    public static final String FUNC_GETDECIMALS = "getDecimals";

    public static final String FUNC_SETSTREET = "setStreet";

    public static final String FUNC_TRANSFERFROM = "transferFrom";

    public static final Event TRANSFER_EVENT = new Event("Transfer", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event TRANSFERFROM_EVENT = new Event("TransferFrom", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<Address>(true) {}, new TypeReference<Uint256>() {}));
    ;

    public static final Event TRADE_EVENT = new Event("Trade", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Address>(true) {}, new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<Uint8>() {}, new TypeReference<Bytes32>() {}, new TypeReference<Bytes32>() {}));
    ;

    public static final Event PASSTO_EVENT = new Event("PassTo", 
            Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}, new TypeReference<Uint8>() {}, new TypeReference<Bytes32>() {}, new TypeReference<Bytes32>() {}, new TypeReference<Address>(true) {}));
    ;

    @Deprecated
    protected Meetup(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Meetup(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Meetup(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Meetup(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<TransactionReceipt> passTo(BigInteger expiry, List<BigInteger> ticketIndices, BigInteger v, byte[] r, byte[] s, String recipient) {
        final Function function = new Function(
                FUNC_PASSTO, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(expiry), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(ticketIndices, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s), 
                new org.web3j.abi.datatypes.Address(recipient)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> supportsInterface(byte[] interfaceID) {
        final Function function = new Function(FUNC_SUPPORTSINTERFACE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes4(interfaceID)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<String> getLocality(BigInteger tokenId) {
        final Function function = new Function(FUNC_GETLOCALITY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> name() {
        final Function function = new Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getBuildingName(BigInteger tokenId) {
        final Function function = new Function(FUNC_GETBUILDINGNAME, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getSymbol() {
        final Function function = new Function(FUNC_GETSYMBOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> paymaster() {
        final Function function = new Function(FUNC_PAYMASTER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Boolean> spawned(BigInteger ticket) {
        final Function function = new Function(FUNC_SPAWNED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(ticket)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> transfer(String _to, List<BigInteger> ticketIndices) {
        final Function function = new Function(
                FUNC_TRANSFER, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(ticketIndices, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> spawnedTickets(BigInteger param0) {
        final Function function = new Function(FUNC_SPAWNEDTICKETS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> decimals() {
        final Function function = new Function(FUNC_DECIMALS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> getThisContractAddress() {
        final Function function = new Function(FUNC_GETTHISCONTRACTADDRESS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getStreet(BigInteger tokenId) {
        final Function function = new Function(FUNC_GETSTREET, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> getState(BigInteger tokenId) {
        final Function function = new Function(FUNC_GETSTATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setLocality(List<BigInteger> tokenIds, String newLocality) {
        final Function function = new Function(
                FUNC_SETLOCALITY, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tokenIds, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.Utf8String(newLocality)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> spawnPassTo(BigInteger expiry, List<BigInteger> tickets, BigInteger v, byte[] r, byte[] s, String recipient, BigInteger weiValue) {
        final Function function = new Function(
                FUNC_SPAWNPASSTO, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(expiry), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tickets, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s), 
                new org.web3j.abi.datatypes.Address(recipient)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteCall<Boolean> isStormBirdContract() {
        final Function function = new Function(FUNC_ISSTORMBIRDCONTRACT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<List> balanceOf(String _owner) {
        final Function function = new Function(FUNC_BALANCEOF, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_owner)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<BigInteger> getAmountTransferred() {
        final Function function = new Function(FUNC_GETAMOUNTTRANSFERRED, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<String> street() {
        final Function function = new Function(FUNC_STREET, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> trade(BigInteger expiry, List<BigInteger> ticketIndices, BigInteger v, byte[] r, byte[] s, BigInteger weiValue) {
        final Function function = new Function(
                FUNC_TRADE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(expiry), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(ticketIndices, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.generated.Uint8(v), 
                new org.web3j.abi.datatypes.generated.Bytes32(r), 
                new org.web3j.abi.datatypes.generated.Bytes32(s)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteCall<String> organiser() {
        final Function function = new Function(FUNC_ORGANISER, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> locality() {
        final Function function = new Function(FUNC_LOCALITY, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> symbol() {
        final Function function = new Function(FUNC_SYMBOL, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<TransactionReceipt> setState(List<BigInteger> tokenIds, String newState) {
        final Function function = new Function(
                FUNC_SETSTATE, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tokenIds, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.Utf8String(newState)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setExpired(List<BigInteger> tokenIds, Boolean isExpired) {
        final Function function = new Function(
                FUNC_SETEXPIRED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tokenIds, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.Bool(isExpired)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setBuilding(List<BigInteger> tokenIds, String newBuildingName) {
        final Function function = new Function(
                FUNC_SETBUILDING, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tokenIds, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.Utf8String(newBuildingName)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> endContract() {
        final Function function = new Function(
                FUNC_ENDCONTRACT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> state() {
        final Function function = new Function(FUNC_STATE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<List> myBalance() {
        final Function function = new Function(FUNC_MYBALANCE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Uint256>>() {}));
        return new RemoteCall<List>(
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteCall<TransactionReceipt> loadNewTickets(List<BigInteger> tickets) {
        final Function function = new Function(
                FUNC_LOADNEWTICKETS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tickets, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> isExpired(BigInteger tokenId) {
        final Function function = new Function(FUNC_ISEXPIRED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(tokenId)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<String> building() {
        final Function function = new Function(FUNC_BUILDING, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> getDecimals() {
        final Function function = new Function(FUNC_GETDECIMALS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> setStreet(List<BigInteger> tokenIds, String newStreet) {
        final Function function = new Function(
                FUNC_SETSTREET, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tokenIds, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.Utf8String(newStreet)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> transferFrom(String _from, String _to, List<BigInteger> ticketIndices) {
        final Function function = new Function(
                FUNC_TRANSFERFROM, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_from), 
                new org.web3j.abi.datatypes.Address(_to), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(ticketIndices, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Meetup> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, List<BigInteger> tickets, String organiserAddr, String paymasterAddr, String recipientAddr, String buildingName, String streetName, String localityName, String stateName, String symbolName, String contractName) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tickets, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.Address(organiserAddr), 
                new org.web3j.abi.datatypes.Address(paymasterAddr), 
                new org.web3j.abi.datatypes.Address(recipientAddr), 
                new org.web3j.abi.datatypes.Utf8String(buildingName), 
                new org.web3j.abi.datatypes.Utf8String(streetName), 
                new org.web3j.abi.datatypes.Utf8String(localityName), 
                new org.web3j.abi.datatypes.Utf8String(stateName), 
                new org.web3j.abi.datatypes.Utf8String(symbolName), 
                new org.web3j.abi.datatypes.Utf8String(contractName)));
        return deployRemoteCall(Meetup.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Meetup> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, List<BigInteger> tickets, String organiserAddr, String paymasterAddr, String recipientAddr, String buildingName, String streetName, String localityName, String stateName, String symbolName, String contractName) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tickets, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.Address(organiserAddr), 
                new org.web3j.abi.datatypes.Address(paymasterAddr), 
                new org.web3j.abi.datatypes.Address(recipientAddr), 
                new org.web3j.abi.datatypes.Utf8String(buildingName), 
                new org.web3j.abi.datatypes.Utf8String(streetName), 
                new org.web3j.abi.datatypes.Utf8String(localityName), 
                new org.web3j.abi.datatypes.Utf8String(stateName), 
                new org.web3j.abi.datatypes.Utf8String(symbolName), 
                new org.web3j.abi.datatypes.Utf8String(contractName)));
        return deployRemoteCall(Meetup.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Meetup> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, List<BigInteger> tickets, String organiserAddr, String paymasterAddr, String recipientAddr, String buildingName, String streetName, String localityName, String stateName, String symbolName, String contractName) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tickets, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.Address(organiserAddr), 
                new org.web3j.abi.datatypes.Address(paymasterAddr), 
                new org.web3j.abi.datatypes.Address(recipientAddr), 
                new org.web3j.abi.datatypes.Utf8String(buildingName), 
                new org.web3j.abi.datatypes.Utf8String(streetName), 
                new org.web3j.abi.datatypes.Utf8String(localityName), 
                new org.web3j.abi.datatypes.Utf8String(stateName), 
                new org.web3j.abi.datatypes.Utf8String(symbolName), 
                new org.web3j.abi.datatypes.Utf8String(contractName)));
        return deployRemoteCall(Meetup.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Meetup> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, List<BigInteger> tickets, String organiserAddr, String paymasterAddr, String recipientAddr, String buildingName, String streetName, String localityName, String stateName, String symbolName, String contractName) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(tickets, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.Address(organiserAddr), 
                new org.web3j.abi.datatypes.Address(paymasterAddr), 
                new org.web3j.abi.datatypes.Address(recipientAddr), 
                new org.web3j.abi.datatypes.Utf8String(buildingName), 
                new org.web3j.abi.datatypes.Utf8String(streetName), 
                new org.web3j.abi.datatypes.Utf8String(localityName), 
                new org.web3j.abi.datatypes.Utf8String(stateName), 
                new org.web3j.abi.datatypes.Utf8String(symbolName), 
                new org.web3j.abi.datatypes.Utf8String(contractName)));
        return deployRemoteCall(Meetup.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public List<TransferEventResponse> getTransferEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TRANSFER_EVENT, transactionReceipt);
        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransferEventResponse typedResponse = new TransferEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._to = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<TransferEventResponse> transferEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, TransferEventResponse>() {
            @Override
            public TransferEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TRANSFER_EVENT, log);
                TransferEventResponse typedResponse = new TransferEventResponse();
                typedResponse.log = log;
                typedResponse._to = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<TransferEventResponse> transferEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRANSFER_EVENT));
        return transferEventObservable(filter);
    }

    public List<TransferFromEventResponse> getTransferFromEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TRANSFERFROM_EVENT, transactionReceipt);
        ArrayList<TransferFromEventResponse> responses = new ArrayList<TransferFromEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TransferFromEventResponse typedResponse = new TransferFromEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse._from = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse._to = (String) eventValues.getIndexedValues().get(1).getValue();
            typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<TransferFromEventResponse> transferFromEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, TransferFromEventResponse>() {
            @Override
            public TransferFromEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TRANSFERFROM_EVENT, log);
                TransferFromEventResponse typedResponse = new TransferFromEventResponse();
                typedResponse.log = log;
                typedResponse._from = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse._to = (String) eventValues.getIndexedValues().get(1).getValue();
                typedResponse.count = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<TransferFromEventResponse> transferFromEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRANSFERFROM_EVENT));
        return transferFromEventObservable(filter);
    }

    public List<TradeEventResponse> getTradeEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TRADE_EVENT, transactionReceipt);
        ArrayList<TradeEventResponse> responses = new ArrayList<TradeEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TradeEventResponse typedResponse = new TradeEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.seller = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.ticketIndices = (List<BigInteger>) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.v = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.r = (byte[]) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.s = (byte[]) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<TradeEventResponse> tradeEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, TradeEventResponse>() {
            @Override
            public TradeEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TRADE_EVENT, log);
                TradeEventResponse typedResponse = new TradeEventResponse();
                typedResponse.log = log;
                typedResponse.seller = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.ticketIndices = (List<BigInteger>) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.v = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.r = (byte[]) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.s = (byte[]) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<TradeEventResponse> tradeEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TRADE_EVENT));
        return tradeEventObservable(filter);
    }

    public List<PassToEventResponse> getPassToEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(PASSTO_EVENT, transactionReceipt);
        ArrayList<PassToEventResponse> responses = new ArrayList<PassToEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            PassToEventResponse typedResponse = new PassToEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.recipient = (String) eventValues.getIndexedValues().get(0).getValue();
            typedResponse.ticketIndices = (List<BigInteger>) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.v = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.r = (byte[]) eventValues.getNonIndexedValues().get(2).getValue();
            typedResponse.s = (byte[]) eventValues.getNonIndexedValues().get(3).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<PassToEventResponse> passToEventObservable(EthFilter filter) {
        return web3j.ethLogObservable(filter).map(new Func1<Log, PassToEventResponse>() {
            @Override
            public PassToEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(PASSTO_EVENT, log);
                PassToEventResponse typedResponse = new PassToEventResponse();
                typedResponse.log = log;
                typedResponse.recipient = (String) eventValues.getIndexedValues().get(0).getValue();
                typedResponse.ticketIndices = (List<BigInteger>) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.v = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.r = (byte[]) eventValues.getNonIndexedValues().get(2).getValue();
                typedResponse.s = (byte[]) eventValues.getNonIndexedValues().get(3).getValue();
                return typedResponse;
            }
        });
    }

    public Observable<PassToEventResponse> passToEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(PASSTO_EVENT));
        return passToEventObservable(filter);
    }

    @Deprecated
    public static Meetup load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Meetup(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Meetup load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Meetup(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Meetup load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Meetup(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Meetup load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Meetup(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class TransferEventResponse {
        public Log log;

        public String _to;

        public BigInteger count;
    }

    public static class TransferFromEventResponse {
        public Log log;

        public String _from;

        public String _to;

        public BigInteger count;
    }

    public static class TradeEventResponse {
        public Log log;

        public String seller;

        public List<BigInteger> ticketIndices;

        public BigInteger v;

        public byte[] r;

        public byte[] s;
    }

    public static class PassToEventResponse {
        public Log log;

        public String recipient;

        public List<BigInteger> ticketIndices;

        public BigInteger v;

        public byte[] r;

        public byte[] s;
    }
}
