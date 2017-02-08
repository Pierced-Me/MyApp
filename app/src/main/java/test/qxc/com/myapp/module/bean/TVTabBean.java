package test.qxc.com.myapp.module.bean;

import test.qxc.com.mylibrary.net.ResponseBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public class TVTabBean extends ResponseBean {


    /**
     * icon_gray : http://uimg.quanmin.tv/1480649956/53ef5.png
     * icon_image : http://uimg.quanmin.tv/1480649936/10414.png
     * icon_red : http://uimg.quanmin.tv/1480649951/4b823.png
     * id : 29
     * is_default : 1
     * name : 颜值控
     * screen : 1
     * slug : love
     * sort : 999
     * type : 2
     */

    private String name;
    private String slug;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String mSlug) {
        slug = mSlug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
