package gdou.gdou_chb.features.user.login;

import gdou.gdou_chb.data.user.User;
import gdou.gdou_chb.util.MVP.BasePresenter;
import gdou.gdou_chb.util.MVP.BaseView;

/**
 * Created by Z1shiki on 2016/11/16.
 */

public interface LoginContract {

    interface View extends BaseView<Presenter>{
        void loginprogress(boolean show);
        void showloginstate();
        void populateAutoComplete();
    }

    interface Presenter extends BasePresenter{
        void login(User user);
    }
}
