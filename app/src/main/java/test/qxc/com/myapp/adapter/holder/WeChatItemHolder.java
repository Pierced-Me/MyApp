package test.qxc.com.myapp.adapter.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.module.bean.WeChatBean;
import test.qxc.com.mylibrary.base.BaseViewHolder;
import test.qxc.com.mylibrary.utils.glideutils.imageutils.ImageUtilsManager;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public class WeChatItemHolder extends BaseViewHolder {

    private TextView title;
    private TextView name;
    private TextView time;
    private ImageView iv;

    public WeChatItemHolder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.wechat_item_tv_title);
        name = (TextView) itemView.findViewById(R.id.wechat_item_tv_name);
        time = (TextView) itemView.findViewById(R.id.wechat_item_tv_time);
        iv = (ImageView) itemView.findViewById(R.id.wechat_item_iv);
    }

    @Override
    public void setData(Context context, Object o) {

        WeChatBean.NewslistBean newslistBean = (WeChatBean.NewslistBean) o;
        title.setText(newslistBean.getTitle());
        name.setText(newslistBean.getDescription());
        time.setText(newslistBean.getCtime());
        ImageUtilsManager.getGlideUtils(ImageUtilsManager.Type.GLIDE).display(iv, newslistBean.getPicUrl());
    }
}
