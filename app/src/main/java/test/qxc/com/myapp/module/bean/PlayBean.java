package test.qxc.com.myapp.module.bean;

import com.google.gson.annotations.SerializedName;

import test.qxc.com.mylibrary.net.ResponseBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/12.
 */

public class PlayBean extends ResponseBean {

    public Live live;
    public class Live {
        public Ws ws;
        public class Ws {
            public Hls hls;
            public class Hls {
                @SerializedName("3")
                public Three three;
                public class Three {
                    public String name;
                    public String src;
                }
            }
        }
    }
}
