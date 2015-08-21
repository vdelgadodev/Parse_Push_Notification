package touchboxapps.parsepushnotification;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by vdelgado on 10/08/2015.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        /**
         * Parse.initialize(Context context, String applicationId, String clientKey)
         * TODO:Change to your applicationID and ClientKEY
         */
        Parse.initialize(this, "applicationId", "clientKey");
        ParseInstallation.getCurrentInstallation().saveInBackground();
        super.onCreate();
    }
}
