package test.qxc.com.myapp.adapter.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.module.bean.ColumnBean;
import test.qxc.com.mylibrary.base.BaseViewHolder;
import test.qxc.com.mylibrary.utils.glideutils.imageutils.ImageUtilsManager;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public class ColumnItemHolder extends BaseViewHolder {

    private TextView title;
    private TextView des;
    private ImageView iv;

    public ColumnItemHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.column_item_tv_title);
        des = (TextView) itemView.findViewById(R.id.column_item_tv_des);
        iv = (ImageView) itemView.findViewById(R.id.colum_item_iv);
    }

    @Override
    public void setData(Context context, Object o) {

        ColumnBean.DataBean dataBean = (ColumnBean.DataBean) o;
        title.setText(dataBean.getName());
        des.setText(dataBean.getDescription());
        ImageUtilsManager.getGlideUtils(ImageUtilsManager.Type.GLIDE).displayRoundImg(iv, dataBean.getThumbnail());
    }
}
