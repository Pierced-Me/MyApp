package test.qxc.com.mylibrary.base;

import android.os.Bundle;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/28.
 */

public interface IActivity {
    public int bindRootView();
    public void initData();
    public void initView(Bundle savedInstanceState);
}
