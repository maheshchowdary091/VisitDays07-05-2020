package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object TestVar
     
    /**
     * <p></p>
     */
    public static Object StagingUrl
     
    /**
     * <p></p>
     */
    public static Object CurrentMobiUrl
     
    /**
     * <p></p>
     */
    public static Object EvrUrl
     
    /**
     * <p></p>
     */
    public static Object EvrcUrl
     
    /**
     * <p></p>
     */
    public static Object TokenEndPoint
     
    /**
     * <p>Profile Main Staging : https:&#47;&#47;staging-mobi.visitdays.com&#47;register&#47;individual-academics?subdomain=bbtesting</p>
     */
    public static Object ReferHeader
     
    /**
     * <p></p>
     */
    public static Object RegistrationEndPoint
     
    /**
     * <p></p>
     */
    public static Object SurveyCodeEndPoint
     
    /**
     * <p>Profile Main Staging : https:&#47;&#47;staging-s.visitdays.com&#47;bbtesting&#47;surv&#47;</p>
     */
    public static Object SurveyLink
     
    /**
     * <p></p>
     */
    public static Object SurveyPageUrlInAdminApp
     
    /**
     * <p></p>
     */
    public static Object CampaignUrl
     
    /**
     * <p>Profile Charizard Staging : albrightsandbox , bbtesting
Profile Main Staging : albrightsandbox , bbtesting
Profile Metapod Staging : albrightsandbox , bbtesting
Profile Pikachu Staging : albrightsandbox , bbtesting</p>
     */
    public static Object Institution
     
    /**
     * <p></p>
     */
    public static Object SelfServeUrl
     
    /**
     * <p></p>
     */
    public static Object temp
     
    /**
     * <p></p>
     */
    public static Object apiBaseUrl
     
    /**
     * <p></p>
     */
    public static Object registrationEndPoint
     
    /**
     * <p></p>
     */
    public static Object Host
     
    /**
     * <p></p>
     */
    public static Object Origin
     
    /**
     * <p></p>
     */
    public static Object Referer
     
    /**
     * <p></p>
     */
    public static Object StudentAppUrl
     
    /**
     * <p></p>
     */
    public static Object institutionId
     
    /**
     * <p></p>
     */
    public static Object MainStagingMobiUrl
     
    /**
     * <p></p>
     */
    public static Object CharizardMobiUrl
     
    /**
     * <p></p>
     */
    public static Object PikachuMobiUrl
     
    /**
     * <p></p>
     */
    public static Object ReusableMobiUrl
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            TestVar = selectedVariables['TestVar']
            StagingUrl = selectedVariables['StagingUrl']
            CurrentMobiUrl = selectedVariables['CurrentMobiUrl']
            EvrUrl = selectedVariables['EvrUrl']
            EvrcUrl = selectedVariables['EvrcUrl']
            TokenEndPoint = selectedVariables['TokenEndPoint']
            ReferHeader = selectedVariables['ReferHeader']
            RegistrationEndPoint = selectedVariables['RegistrationEndPoint']
            SurveyCodeEndPoint = selectedVariables['SurveyCodeEndPoint']
            SurveyLink = selectedVariables['SurveyLink']
            SurveyPageUrlInAdminApp = selectedVariables['SurveyPageUrlInAdminApp']
            CampaignUrl = selectedVariables['CampaignUrl']
            Institution = selectedVariables['Institution']
            SelfServeUrl = selectedVariables['SelfServeUrl']
            temp = selectedVariables['temp']
            apiBaseUrl = selectedVariables['apiBaseUrl']
            registrationEndPoint = selectedVariables['registrationEndPoint']
            Host = selectedVariables['Host']
            Origin = selectedVariables['Origin']
            Referer = selectedVariables['Referer']
            StudentAppUrl = selectedVariables['StudentAppUrl']
            institutionId = selectedVariables['institutionId']
            MainStagingMobiUrl = selectedVariables['MainStagingMobiUrl']
            CharizardMobiUrl = selectedVariables['CharizardMobiUrl']
            PikachuMobiUrl = selectedVariables['PikachuMobiUrl']
            ReusableMobiUrl = selectedVariables['ReusableMobiUrl']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
