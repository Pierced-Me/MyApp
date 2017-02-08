package test.qxc.com.myapp.adapter.holder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.module.bean.ColumnDetailBean;
import test.qxc.com.mylibrary.base.BaseViewHolder;
import test.qxc.com.mylibrary.utils.glideutils.imageutils.ImageUtilsManager;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/5.
 */

public class ColumnDetailItemHolder extends BaseViewHolder {

    private ImageView imageView;
    private TextView textView;

    public ColumnDetailItemHolder(View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.home_item_imageview);
        textView = (TextView) itemView.findViewById(R.id.home_item_textview);
    }

    @Override
    public void setData(Context context, Object o) {

        ColumnDetailBean.StoriesBean storiesBean = (ColumnDetailBean.StoriesBean) o;
        textView.setText(storiesBean.getTitle());
        ImageUtilsManager.getGlideUtils(ImageUtilsManager.Type.GLIDE).display(imageView, storiesBean.getImages().get(0));
    }
}
