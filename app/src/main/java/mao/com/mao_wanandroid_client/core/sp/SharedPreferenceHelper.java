package mao.com.mao_wanandroid_client.core.sp;



/**
 * @author maoqitian
 * @Description SharedPreference 帮助类接口
 * @Time 2018/10/28 0028 23:59
 */
public interface SharedPreferenceHelper {


    void setLoginUserName(String userName);

    /**
     *存储登录密码
     *
     * @param password Password
     */
    void setLoginPassword(String password);


    String getLoginUserName();

    /**
     * 获取存储的登录密码
     *
     * @return password
     */
    String getLoginPassword();

    /**
     * 设置登录状态
     *
     * @param loginStatus
     */
    void setLoginStatus(boolean loginStatus);

    /**
     * 获取登录状态
     * @return
     */
    boolean getLoginStatus();

    /**
     * 保存 cookie
     *
     * @param domain Domain
     * @param cookie Cookie
     */
    void setCookie(String domain, String cookie);

    /**
     * 获取保存的 cookie
     * @param domain
     * @return cookie
     */
    String getCookie(String domain);

    /**
     * 保存当前 page
     *
     * @param position
     */
    void setCurrentPage(int position);

    /**
     * 获取保存当前页码
     *
     * @return
     */
    int getCurrentPage();

    /**
     * 保存project当前页码
     *
     * @param position
     */
    void setProjectCurrentPage(int position);

    /**
     * 获取保存project当前页码
     *
     * @return current
     */
    int getProjectCurrentPage();

    /**
     *
     * @return
     */
    boolean getAutoCacheState();

    boolean getNoImageState();

    /**
     * 获取夜间模式状态
     * @return
     */
    boolean getNightModeState();

    /**
     * 保存夜间模式状态
     * @return
     */
    void setNightModeState(boolean b);


    void setNoImageState(boolean b);
    /**
     *
     * @return
     */
    void setAutoCacheState(boolean b);
}
