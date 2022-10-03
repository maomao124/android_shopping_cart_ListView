package mao.android_shopping_cart_listview.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mao.android_shopping_cart_listview.R;
import mao.android_shopping_cart_listview.entity.CartListViewInfo;

/**
 * Project name(项目名称)：android_shopping_cart_ListView
 * Package(包名): mao.android_shopping_cart_listview.adapter
 * Class(类名): CartListViewAdapter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/3
 * Time(创建时间)： 21:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class CartListViewAdapter extends BaseAdapter
{

    /**
     * 上下文
     */
    private final Context context;

    /**
     * 列表
     */
    private final List<CartListViewInfo> list;

    /**
     * 购物车列表视图适配器
     *
     * @param context 上下文
     * @param list    列表
     */
    public CartListViewAdapter(Context context, List<CartListViewInfo> list)
    {
        this.context = context;
        this.list = list;
    }

    /**
     * 得到总数
     *
     * @return int
     */
    @Override
    public int getCount()
    {
        return list.size();
    }

    /**
     * 获取CartListViewInfo
     *
     * @param position 位置
     * @return {@link Object}
     */
    @Override
    public Object getItem(int position)
    {
        return list.get(position);
    }

    /**
     * 获取CartListViewInfo的id
     *
     * @param position 位置
     * @return long
     */
    @Override
    public long getItemId(int position)
    {
        return position;
    }

    /**
     * 得到视图
     *
     * @param position    位置
     * @param convertView 将视图
     * @param parent      ViewGroup
     * @return {@link View}
     */
    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        CartListViewHolder cartListViewHolder;
        if (convertView == null)
        {
            cartListViewHolder = new CartListViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_cart, null);
            cartListViewHolder.iv_thumb = convertView.findViewById(R.id.iv_thumb);
            cartListViewHolder.tv_name = convertView.findViewById(R.id.tv_name);
            cartListViewHolder.tv_desc = convertView.findViewById(R.id.tv_desc);
            cartListViewHolder.tv_count = convertView.findViewById(R.id.tv_count);
            cartListViewHolder.tv_price = convertView.findViewById(R.id.tv_price);
            cartListViewHolder.tv_sum = convertView.findViewById(R.id.tv_sum);
            convertView.setTag(cartListViewHolder);
        }
        else
        {
            cartListViewHolder = (CartListViewHolder) convertView.getTag();
        }
        CartListViewInfo cartListViewInfo = list.get(position);
        cartListViewHolder.iv_thumb.setImageURI(Uri.parse(cartListViewInfo.getPicPath()));
        cartListViewHolder.tv_name.setText(cartListViewInfo.getName());
        cartListViewHolder.tv_desc.setText(cartListViewInfo.getDesc());
        cartListViewHolder.tv_count.setText(String.valueOf(cartListViewInfo.getCount()));
        cartListViewHolder.tv_price.setText(String.valueOf((int) cartListViewInfo.getPrice()));
        // 设置商品总价
        cartListViewHolder.tv_sum.setText(String.valueOf((int) (cartListViewInfo.getCount() * cartListViewInfo.getPrice())));
        return convertView;
    }


    /**
     * 购物车列表视图持有人
     *
     * @author mao
     * @date 2022/10/03
     */
    private static class CartListViewHolder
    {
        public ImageView iv_thumb;
        public TextView tv_name;
        public TextView tv_desc;
        public TextView tv_count;
        public TextView tv_price;
        public TextView tv_sum;
    }
}
