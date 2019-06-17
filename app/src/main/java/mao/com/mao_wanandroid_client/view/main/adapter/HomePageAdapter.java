package mao.com.mao_wanandroid_client.view.main.adapter;


import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.List;

import mao.com.mao_wanandroid_client.R;
import mao.com.mao_wanandroid_client.model.home.HomeArticleData;
import mao.com.mao_wanandroid_client.view.main.hloder.HomePageViewItemHolder;

/**
 * @author maoqitian
 * @Description 最新博文  RecyclerView Adapter
 * 使用 BRVAH 库的 Adapter https://www.jianshu.com/p/b343fcff51b0
 * @Time 2019/5/18 0018 21:31
 */
public class HomePageAdapter extends BaseQuickAdapter<HomeArticleData, HomePageViewItemHolder> {


    public HomePageAdapter(int layoutResId, @Nullable List<HomeArticleData> data) {
        super(layoutResId, data);
    }

    public HomePageAdapter(@Nullable List<HomeArticleData> data) {
        super(data);
    }

    public HomePageAdapter(int layoutResId) {
        super(layoutResId);
    }

    @Override
    protected void convert(HomePageViewItemHolder helper, HomeArticleData item) {
         helper.setText(R.id.tv_author_name,item.getAuthor());
         helper.setText(R.id.tv_artical_title,item.getTitle());
         helper.setText(R.id.tv_super_chapterName,item.getSuperChapterName());
         helper.setText(R.id.tv_chapterName,item.getChapterName());
         helper.setText(R.id.tv_artical_date,item.getNiceDate());
         // tag
         if(item.getTags().size()>0){
             helper.getView(R.id.tv_artical_tag).setVisibility(View.VISIBLE);
             HomeArticleData.TagsBean tagsBean = item.getTags().get(0);
             helper.setText(R.id.tv_artical_tag,tagsBean.getName());
             helper.setTextColor(R.id.tv_artical_tag, ContextCompat.getColor(mContext, R.color.color_green));
             helper.setBackgroundRes(R.id.tv_artical_tag,R.drawable.tag_green_background);
         }
         // tag 新
         if(item.isFresh()){
             helper.getView(R.id.tv_artical_new_tag).setVisibility(View.VISIBLE);
             helper.setText(R.id.tv_artical_new_tag,mContext.getString(R.string.new_tag));
             helper.setTextColor(R.id.tv_artical_tag, ContextCompat.getColor(mContext, R.color.colorPrimaryDark));
             helper.setBackgroundRes(R.id.tv_artical_tag,R.drawable.tag_red_background);
         }
         //tag 置顶
         if(1 == item.getType()){
             helper.getView(R.id.tv_artical_top_tag).setVisibility(View.VISIBLE);
             helper.setText(R.id.tv_artical_top_tag,mContext.getString(R.string.top_tag));
             helper.setTextColor(R.id.tv_artical_top_tag, ContextCompat.getColor(mContext, R.color.color_red));
             helper.setBackgroundRes(R.id.tv_artical_top_tag,R.drawable.tag_top_red_background);
         }
    }
}
