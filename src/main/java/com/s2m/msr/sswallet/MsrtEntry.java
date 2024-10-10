package com.s2m.msr.sswallet;

/*
* @author Hicham ELKASMI DONE AGAIN
*/

import com.ssw.bnk.swint.jdbc.*;
import com.ssw.bnk.swint.jdbc.requests.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/lib")
public class MsrtEntry {
    static{
        try {
            SS_INIT.startApp(true);
        } catch (Exception ex) {
            Logger.getLogger(MsrtEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*@POST
    @Path("/getbalance")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getbalance(SSReq_Balance sSReq_Balance) {
        SW_ENTRY entry = new SW_ENTRY();
        return entry.getBalance(sSReq_Balance);
    } 
    */
    
    @POST
    @Path("/getbalance")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getbalance(OpgReq_Balance opgReq_Balance) {
        SS_Entry entry = new SS_Entry();
        return entry.getBalance(opgReq_Balance);
    }     
    
    @POST
    @Path("/changestatus")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String changeCardStatus(OpgReq_CardStUp cardStUp) {
        SS_Entry entry = new SS_Entry();
        return entry.changeCardStatus(cardStUp);
    }
   
    @POST
    @Path("/firstactivation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String firstActivation(OpgReq_CardFirstActivation cardFirActi) {
        SS_Entry entry = new SS_Entry();
        return entry.firstActivation(cardFirActi);
    }
    
    @POST
    @Path("/resetpin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String resetPin(OpgReq_ResetPin reqResetPin) {
        SS_Entry entry = new SS_Entry();
        return entry.resetPin(reqResetPin);
    }
    
    @POST
    @Path("/getrepository")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getRepository(OpgReq_GetRepos reqGetRepos) {
        SS_Entry entry = new SS_Entry();
        return entry.getRepository(reqGetRepos);
    }
    
    @POST
    @Path("/replacement")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String replacement(OpgReq_Replacement reqReplacement) {
        SS_Entry entry = new SS_Entry();
        return entry.replacement(reqReplacement);
    }
    
    @POST
    @Path("/renew")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String reNew(OpgReq_ReNew reqReNew) {
        SS_Entry entry = new SS_Entry();
        return entry.reNew(reqReNew);
    }
    
    @POST
    @Path("/cardlist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String cardList(OpgReq_CardList reqCardList) {
        SS_Entry entry = new SS_Entry();
        return entry.cardList(reqCardList);
    }
    
    @POST
    @Path("/accountlist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String accountList(OpgReq_AccountList reqAccountList) {
        SS_Entry entry = new SS_Entry();
        return entry.accountList(reqAccountList);
    }
    
    @POST
    @Path("/customerlist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String customerList(OpgReq_CustomerList reqCustomerList) {
        SS_Entry entry = new SS_Entry();
        return entry.customerList(reqCustomerList);
    }
    
    @POST
    @Path("/prepaidapplication")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String prepaidApplication(OpgReq_PrepaidApplication reqPrepApplication) {
        SS_Entry entry = new SS_Entry();
        return entry.prepaidApplication(reqPrepApplication);
    }
    
    @POST
    @Path("/prepaidapplicationvalidation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String prepaidAppliValidation(OpgReq_PrepaidAppliValidation reqPrepaidAppliValidation) {
        SS_Entry entry = new SS_Entry();
        return entry.prepaidAppliValidation(reqPrepaidAppliValidation);
    }
    
    @POST
    @Path("/prepaidapplicationlist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String prepaidApplicationList(OpgReq_PrepaidApplicationList reqPrepaidAppliList) {
        SS_Entry entry = new SS_Entry();
        return entry.prepaidApplicationList(reqPrepaidAppliList);
    }
    
    @POST
    @Path("/debitapplication")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String debitApplication(OpgReq_DebitApplication reqDebitApplication) {
        SS_Entry entry = new SS_Entry();
        return entry.debitApplication(reqDebitApplication);
    }
    
    @POST
    @Path("/debitapplicationvalidation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String debitAppliValidation(OpgReq_PrepaidAppliValidation reqDebitAppliValidation) {
        SS_Entry entry = new SS_Entry();
        return entry.debitAppliValidation(reqDebitAppliValidation);
    }
    
    @POST
    @Path("/debitapplicationlist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String debitApplicationList(OpgReq_PrepaidApplicationList reqDebitAppliList) {
        SS_Entry entry = new SS_Entry();
        return entry.debitApplicationList(reqDebitAppliList);
    }
    
    @POST
    @Path("/redemption")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String redemption(OpgReq_Redemption reqRedemption) {
        SS_Entry entry = new SS_Entry();
        return entry.redemption(reqRedemption);
    }
    
    @POST
    @Path("/reload")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String reload(OpgReq_Reload reqReload) {
        SS_Entry entry = new SS_Entry();
        return entry.reload(reqReload);
    }
    
    @POST
    @Path("/merchantapplication")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String merchant(OpgReq_Merchant reqMerchant) {
        SS_Entry entry = new SS_Entry();
        return entry.merchant(reqMerchant);
    }
    
    @POST
    @Path("/merchantapplicationupdate")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String merchantUpdate (OpgReq_MerchantUpdate reqMerchant) {
        SS_Entry entry = new SS_Entry();
        return entry.merchantUpdate(reqMerchant);
    }
    
    @POST
    @Path("/merchantupdate")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String merchantUpdateNoApplication (OpgReq_MerchantUpdateNoApplication reqMerchant) {
        SS_Entry entry = new SS_Entry();
        return entry.merchantUpdateNoApplication(reqMerchant);
    }
    
    @POST
    @Path("/merchantapplicationvalidation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String merchantAppliValidation(OpgReq_MerchantAppliValidation reqMerchantAppliValidation) {
        SS_Entry entry = new SS_Entry();
        return entry.merchantAppliValidation(reqMerchantAppliValidation);
    }
    
    @POST
    @Path("/merchantapplicationlist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String merchantApplicationList(OpgReq_MerchantApplicationList reqMerchantAppliList) {
        SS_Entry entry = new SS_Entry();
        return entry.merchantApplicationList(reqMerchantAppliList);
    }
    
    @POST
    @Path("/posterminalapplication")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String posTerminalApplication(OpgReq_PosTerminalApplication reqPosTerminalApplication) {
        SS_Entry entry = new SS_Entry();
        return entry.posTerminalApplication(reqPosTerminalApplication);
    }
    
    @POST
    @Path("/posterminallist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String posTerminalList(OpgReq_PosTerminalList reqPosTerminalList) {
        SS_Entry entry = new SS_Entry();
        return entry.posTerminalList(reqPosTerminalList);
    }
    
    @POST
    @Path("/posapplicationlist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String posApplicationList(OpgReq_PosApplicationList reqPosApplicationList) {
        SS_Entry entry = new SS_Entry();
        return entry.posApplicationList(reqPosApplicationList);
    }
    
    @POST
    @Path("/authorizationinquirylist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String authorizitionList (OpgReq_AuthorizitaionList reqAuthorizitaionList) {
        SS_Entry entry = new SS_Entry();
        return entry.authorizitionList(reqAuthorizitaionList);
    }
    
    /*@POST
    @Path("/gettransactions")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String gettransactions(SSReq_TransactionsList sSReq_TransactionsList) {
        SW_ENTRY entry = new SW_ENTRY();
        return entry.getTransactions(sSReq_TransactionsList);
    }
    */
    
    
    @POST
    @Path("/accounttransfer")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String accountTransfer (OpgReq_AccountTransfer AccountTransfer) {
        SS_Entry entry = new SS_Entry();
        return entry.accountTransfer(AccountTransfer);
    }
    
    @POST
    @Path("/checkbookrequest")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String checkBookRequest (OpgReq_CheckBookRequest CheckBookRequest) {
        SS_Entry entry = new SS_Entry();
        return entry.checkBookRequest(CheckBookRequest);
    }
    
    @POST
    @Path("/pingserver")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String pingserver (OpgReq_PingServerRequest PingServerRequest) {
        SS_Entry entry = new SS_Entry();
        return entry.pingserver(PingServerRequest);
    }
    
    @POST
    @Path("/creditapplication")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String creditApplication(OpgReq_CreditApplication reqcreditApplication) {
        SS_Entry entry = new SS_Entry();
        return entry.creditApplication(reqcreditApplication);
    }
    
    @POST
    @Path("/creditapplicationvalidation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String creditApplicationvalidation(OpgReq_CreditApplicationValidation reqcreditApplicationValidation) {
        SS_Entry entry = new SS_Entry();
        return entry.creditAppliValidation(reqcreditApplicationValidation);
    }
    
    @POST
    @Path("/creditapplicationlist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String creditApplicationlist(OpgReq_CreditApplicationList reqcreditApplicationList) {
        SS_Entry entry = new SS_Entry();
        return entry.creditApplicationList(reqcreditApplicationList);
    }
    
    @POST
    @Path("/updatemobile")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String updatemobile(OpgReq_UpdateMobile reqUpMobile) {
        SS_Entry entry = new SS_Entry();
        return entry.updatemobile(reqUpMobile);
    }
    
    @POST
    @Path("/updateaccount")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String updateaccount(OpgReq_UpdateAccount reqUpAccount) {
        SS_Entry entry = new SS_Entry();
        return entry.updateaccount(reqUpAccount);
    }
    
    @POST
    @Path("/updatemerchantstatus")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String updatemerchantstatus(OpgReq_MerchantStatus reqUpMerchantSt) {
        SS_Entry entry = new SS_Entry();
        return entry.updatemerchantstatus(reqUpMerchantSt);
    }
  
    @POST
    @Path("/interfacelist")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String interfacelist(OpgReq_InterfaceList reqInterfaceList) {
        SS_Entry entry = new SS_Entry();
        return entry.interfaceList(reqInterfaceList);
    }
    
    @POST
    @Path("/internetmailorderstatus")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String internetmailorderstatus(OpgReq_InternetMailOrderStatus reqUpIntMailOrderSt) {
        SS_Entry entry = new SS_Entry();
        return entry.internetmailorderstatus(reqUpIntMailOrderSt);
    }
    
    @POST
    @Path("/anonymprepaidcard")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String anonymprepaidCard(OpgReq_anonymPrepaidCard ReqanonymPrepaidCard) {
        SS_Entry entry = new SS_Entry();
        return entry.anonymPrepaidCard(ReqanonymPrepaidCard);
    }
    
    @POST
    @Path("/changecommissionmerchant")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String changeCommissionMerchant(OpgReq_MerchantCommissionUpdate reqUpMerchantCommission) {
        SS_Entry entry = new SS_Entry();
        return entry.changeCommissionMerchant(reqUpMerchantCommission);
    }
    
    @POST
    @Path("/manageaddress")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String manageaddress(OpgReq_ManageAddress reqmanageAdress) {
        SS_Entry entry = new SS_Entry();
        return entry.manageaddress(reqmanageAdress);
    }
    
    @POST
    @Path("/addchargeback")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String addChargeBack(OpgReq_AddChargeBack reqAddChargeBack) {
        SS_Entry entry = new SS_Entry();
        return entry.addChargeBack(reqAddChargeBack);
    }
    
    @POST
    @Path("/purchaseauth")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String purchaseAuth(OpgReq_PurchaseAuth reqPurchaseAuth) {
        SS_Entry entry = new SS_Entry();
        return entry.purchaseAuth(reqPurchaseAuth);
    }
    
    @POST
    @Path("/authreversal")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String AuthReversal (OpgReq_AuthReversal reqAuthReversal) {
        SS_Entry entry = new SS_Entry();
        return entry.AuthReversal(reqAuthReversal);
    }
    
    @POST
    @Path("/purchaseadvice")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String PurchaseAdvice (OpgReq_PurchaseAdvice reqPurchaseAdvice) {
        SS_Entry entry = new SS_Entry();
        return entry.PurchaseAdvice(reqPurchaseAdvice);
    }     
    
    @POST
    @Path("/updateriskcode")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String UpdateRiskCard (OpgReq_RiskCardUpdate reqRiskCardUpdate) {
        SS_Entry entry = new SS_Entry();
        return entry.UpdateRiskCard(reqRiskCardUpdate);
    } 
    
    @POST
    @Path("/anonymdebitcard")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String anonymDebitCard(OpgReq_anonymDebitCard ReqanonymDebitCard) {
        SS_Entry entry = new SS_Entry();
        return entry.anonymDebitCard(ReqanonymDebitCard);
    }
    
    @POST
    @Path("/terminalsbymerchant")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getTerminalsByMerchantId(OpgReq_MerchantTerminalsList opgReq_MerchantTerminalsList) {
            SS_Entry entry = new SS_Entry();
            return entry.getTerminalsByMerchantId(opgReq_MerchantTerminalsList);
    }

    @POST
    @Path("/merchanttransactions")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getMerchantTransactions(OpgReq_MerchantTransactionsList opgReq_MerchantTransactionsList) {
            SS_Entry entry = new SS_Entry();
            return entry.getMerchantTransactions(opgReq_MerchantTransactionsList);
    }

    @POST
    @Path("/merchantterminaltransactions")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getMerchantTerminalTransactions( OpgReq_MerchantTerminalTransactionList opgReq_MerchantTerminalTransactionList) {
            SS_Entry entry = new SS_Entry();
            return entry.getMerchantTerminalTransactions(opgReq_MerchantTerminalTransactionList);
    }

    @POST
    @Path("/cardriskold")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getCardRisk(OpgReq_CardRisk opgReq_CardRisk) {
            SS_Entry entry = new SS_Entry();
            return entry.getCardRisk(opgReq_CardRisk);
    }

    @POST
    @Path("/posmonitoring")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getPosMonitoring(OpgReq_PosMonitoring opgReq_PosMonitoring) {
            SS_Entry entry = new SS_Entry();
            return entry.getPosMonitoring(opgReq_PosMonitoring);
    }

    @POST
    @Path("/sendpinbysms")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getPosMonitoring(OpgReq_PinBySms opgReq_PinBySms) {
            SS_Entry entry = new SS_Entry();
            return entry.sendPinBySms(opgReq_PinBySms);
    }

    @POST
    @Path("/sendpinbyemail")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String sendPinbyEmail(OpgReq_PinByEmail opgReq_PinByEmail) {
            SS_Entry entry = new SS_Entry();
            return entry.sendPinByEmail(opgReq_PinByEmail);
    }

    @POST
    @Path("/atmmonitoring")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String atmMonitoring(OpgReq_AtmMonitoring opgReq_AtmMonitoring) {
            SS_Entry entry = new SS_Entry();
            return entry.atmMonitoring(opgReq_AtmMonitoring);
    }

    @POST
    @Path("/sendsmsalert")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String sendSmsAlert(OpgReq_SendSmsAlert opgReq_SendSmsAlert) {
            SS_Entry entry = new SS_Entry();
            return entry.sendSmsAler(opgReq_SendSmsAlert);
    }

    @POST
    @Path("/debitapplicationnew")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String debitApplicationTemp(OpgReq_DebitApplicationTemp reqDebitApplication) {
            SS_Entry entry = new SS_Entry();
            return entry.debitApplicationTemp(reqDebitApplication);
    }

    @POST
    @Path("/updaterisknew")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String updateRiskNew(OpgReq_RiskList opgReq_RiskList) {
            SS_Entry entry = new SS_Entry();
            return entry.updateRisksCardNew(opgReq_RiskList);
    }


    @POST
    @Path("/programrisk")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getProgramRisk(OpgReq_ProgramRisk opgReq_ProgramRisk) {
            SS_Entry entry = new SS_Entry();
            return entry.getProgramRisk(opgReq_ProgramRisk);
    }

    @POST
    @Path("/cardrisk")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getCardlimitRisk(OpgReq_CardRisk opgReq_CardRisk) {
            SS_Entry entry = new SS_Entry();
            return entry.getCardlimitRisk(opgReq_CardRisk);
    }

    @POST
    @Path("/transtatus")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getstatustypetrans(OpgReq_TransSatuts OpgReq_TransSatuts)  {
            SS_Entry entry = new SS_Entry();
            return entry.getstatustypetrans(OpgReq_TransSatuts);
    }

    @POST
    @Path("/virtualcardcreation")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String debitApplication_virtual_card(OpgReq_VirtualCard reqvirtualcard) {
            SS_Entry entry = new SS_Entry();
            return entry.DEBIT_APPLICATION_VIRTUAL_CARD(reqvirtualcard);
    }

    @POST
    @Path("/validatecardpin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String validate_card_pin(OpgReq_ValidateCardPin validateCardPin) {
            SS_Entry entry = new SS_Entry();
            return entry.VALIDATE_CARD_PIN(validateCardPin);
    }

    @POST
    @Path("/notify")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String notify(OpgReq_notify notify) {
            SS_Entry entry = new SS_Entry();
            return entry.NOTIFY(notify);
    }


    @POST
    @Path("/get_card_print_data")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String get_card_print_data(OpgReq_get_card_print_data opgReq_get_card_print_data) {
            SS_Entry entry = new SS_Entry();
            return entry.GET_CARD_PRINT_DATA(opgReq_get_card_print_data);
    }


}
