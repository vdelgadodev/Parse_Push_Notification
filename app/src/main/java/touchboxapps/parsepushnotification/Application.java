package touchboxapps.parsepushnotification;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by vdelgado on 10/08/2015.
 */
public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        Parse.initialize(this, "applicationID", "clientKey");
        ParseInstallation.getCurrentInstallation().saveInBackground();
        super.onCreate();
    }
}
