package test.qxc.com.myapp.adapter.holder;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.module.bean.TVMainBean;
import test.qxc.com.mylibrary.base.BaseViewHolder;
import test.qxc.com.mylibrary.utils.glideutils.imageutils.ImageUtilsManager;

/**
 * Created by gaojian on 2017/1/5.
 */

public class TvFoot extends BaseViewHolder<TVMainBean.RoomBean> {
    RecyclerView recycler;
    TextView tv;

    public TvFoot(View itemView) {
        super(itemView);
        recycler = (RecyclerView) itemView.findViewById(R.id.foot_recycler);
        tv = (TextView) itemView.findViewById(R.id.category_name);
    }

    @Override
    public void setData(Context context, TVMainBean.RoomBean roomBean) {
        tv.setText(roomBean.name);
        List<TVMainBean.RoomBean.ListBean> list = roomBean.list;
        recycler.setLayoutManager(new GridLayoutManager(context, 2));
        recycler.setAdapter(new CommonAdapter<TVMainBean.RoomBean.ListBean>(context, R.layout.tvmain_footer_item, list) {
            @Override
            protected void convert(ViewHolder holder, TVMainBean.RoomBean.ListBean listBean, int position) {

                holder.setText(R.id.nick, listBean.nick);
                holder.setText(R.id.title, listBean.title);
                ImageView largeImge = holder.getView(R.id.large_image);
                ImageView roundImge = holder.getView(R.id.round_image);
                ImageUtilsManager.getGlideUtils(ImageUtilsManager.Type.GLIDE).displayRoundImg(largeImge, listBean.thumb);
                ImageUtilsManager.getGlideUtils(ImageUtilsManager.Type.GLIDE).displayCircleImg(roundImge, listBean.avatar);
            }
        });
    }
}
