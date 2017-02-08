package test.qxc.com.myapp.adapter.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.module.bean.TVBean;
import test.qxc.com.mylibrary.base.BaseViewHolder;
import test.qxc.com.mylibrary.utils.glideutils.imageutils.IImageLoader;
import test.qxc.com.mylibrary.utils.glideutils.imageutils.ImageUtilsManager;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public class TVFragmentItemViewHolder extends BaseViewHolder {

    private ImageView iv;
    private ImageView icon;
    private TextView name;
    private TextView des;

    public TVFragmentItemViewHolder(View itemView) {
        super(itemView);
        iv = (ImageView) itemView.findViewById(R.id.tv_fm_iv);
        icon = (ImageView) itemView.findViewById(R.id.tv_fm_icon);
        name = (TextView) itemView.findViewById(R.id.tv_fm_name);
        des = (TextView) itemView.findViewById(R.id.tv_fm_des);
    }

    @Override
    public void setData(Context context, Object o) {
        TVBean.DataBean dataBean = (TVBean.DataBean) o;
        IImageLoader glideUtils = ImageUtilsManager.getGlideUtils(ImageUtilsManager.Type.GLIDE);
        glideUtils.displayRoundImg(iv, dataBean.getThumb());
        glideUtils.displayCircleImg(icon, dataBean.getAvatar());
        name.setText(dataBean.getNick());
        des.setText(dataBean.getTitle());
    }
}
