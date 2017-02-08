package test.qxc.com.myapp.view.fragment;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.MyColumnRecyclerViewAdapter;
import test.qxc.com.myapp.module.bean.ColumnBean;
import test.qxc.com.myapp.presenter.ColumnPresenter;
import test.qxc.com.myapp.presenter.ipresenter.IColumnPresenter;
import test.qxc.com.myapp.view.activity.ColumnDetailActivity;
import test.qxc.com.myapp.view.fragment.ifragment.IColumnFragment;
import test.qxc.com.mylibrary.base.BaseFragment;
import test.qxc.com.mylibrary.base.IBaseView;
import test.qxc.com.mylibrary.other.OnRecyclerItemClickListener;

public class ColumnFragment extends BaseFragment<IColumnPresenter> implements IColumnFragment {

    private RecyclerView mRecyclerView;
    private MyColumnRecyclerViewAdapter mColumnRecyclerViewAdapter;

    @Override
    public int bindRootView() {

        return R.layout.fragment_column;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView(Bundle savedInstanceState) {

        mRecyclerView = findView(R.id.column_recyclerview, RecyclerView.class);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getBaseActivity(), 2));
        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.set(2, 2, 2, 2);
            }
        });
        mRecyclerView.addOnItemTouchListener(new OnRecyclerItemClickListener(mRecyclerView) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder vh) {
                int adapterPosition = vh.getAdapterPosition();
                ColumnBean.DataBean itemData = mColumnRecyclerViewAdapter.getItemData(adapterPosition);
                int id = itemData.getId();
                startActivity(new Intent(getBaseActivity(), ColumnDetailActivity.class).putExtra("id", id));
            }

            @Override
            public void onItemLongClick(RecyclerView.ViewHolder vh) {

            }
        });
    }

    @Override
    public void showData(Object o) {

        List<ColumnBean.DataBean> datas = (List<ColumnBean.DataBean>) o;
        mColumnRecyclerViewAdapter = new MyColumnRecyclerViewAdapter(getBaseActivity(), datas);
        mRecyclerView.setAdapter(mColumnRecyclerViewAdapter);
    }

    @Override
    protected IColumnPresenter createPresenter(IBaseView view) {
        return new ColumnPresenter(this);
    }
}
