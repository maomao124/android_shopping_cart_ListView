package mao.android_shopping_cart_listview.entity;


/**
 * Project name(项目名称)：android_shopping_cart_ListView
 * Package(包名): mao.android_shopping_cart_listview.entity
 * Class(类名): CartListViewInfo
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/3
 * Time(创建时间)： 21:01
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class CartListViewInfo
{
    /**
     * 商品id
     */
    private int goodsId;

    /**
     * 图片路径
     */
    private String picPath;

    /**
     * 名字
     */
    private String name;

    /**
     * desc
     */
    private String desc;

    /**
     * 数量
     */
    private int count;

    /**
     * 价格
     */
    private float price;

    /**
     * 总和
     */
    private int sum;

    /**
     * Instantiates a new Cart list view info.
     */
    public CartListViewInfo()
    {

    }

    /**
     * Instantiates a new Cart list view info.
     *
     * @param goodsId the goods id
     * @param picPath the pic path
     * @param name    the name
     * @param desc    the desc
     * @param count   the count
     * @param price   the price
     * @param sum     the sum
     */
    public CartListViewInfo(int goodsId, String picPath, String name, String desc, int count, float price, int sum)
    {
        this.goodsId = goodsId;
        this.picPath = picPath;
        this.name = name;
        this.desc = desc;
        this.count = count;
        this.price = price;
        this.sum = sum;
    }

    /**
     * Gets goods id.
     *
     * @return the goods id
     */
    public int getGoodsId()
    {
        return goodsId;
    }

    /**
     * Sets goods id.
     *
     * @param goodsId the goods id
     * @return the goods id
     */
    public CartListViewInfo setGoodsId(int goodsId)
    {
        this.goodsId = goodsId;
        return this;
    }

    /**
     * Gets pic path.
     *
     * @return the pic path
     */
    public String getPicPath()
    {
        return picPath;
    }

    /**
     * Sets pic path.
     *
     * @param picPath the pic path
     * @return the pic path
     */
    public CartListViewInfo setPicPath(String picPath)
    {
        this.picPath = picPath;
        return this;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     * @return the name
     */
    public CartListViewInfo setName(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc()
    {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     * @return the desc
     */
    public CartListViewInfo setDesc(String desc)
    {
        this.desc = desc;
        return this;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public int getCount()
    {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     * @return the count
     */
    public CartListViewInfo setCount(int count)
    {
        this.count = count;
        return this;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public float getPrice()
    {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     * @return the price
     */
    public CartListViewInfo setPrice(float price)
    {
        this.price = price;
        return this;
    }

    /**
     * Gets sum.
     *
     * @return the sum
     */
    public int getSum()
    {
        return sum;
    }

    /**
     * Sets sum.
     *
     * @param sum the sum
     * @return the sum
     */
    public CartListViewInfo setSum(int sum)
    {
        this.sum = sum;
        return this;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartListViewInfo that = (CartListViewInfo) o;

        if (getGoodsId() != that.getGoodsId()) return false;
        if (getCount() != that.getCount()) return false;
        if (Float.compare(that.getPrice(), getPrice()) != 0) return false;
        if (getSum() != that.getSum()) return false;
        if (getPicPath() != null ? !getPicPath().equals(that.getPicPath()) : that.getPicPath() != null)
        {
            return false;
        }
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null)
        {
            return false;
        }
        return getDesc() != null ? getDesc().equals(that.getDesc()) : that.getDesc() == null;
    }

    @Override
    public int hashCode()
    {
        int result = getGoodsId();
        result = 31 * result + (getPicPath() != null ? getPicPath().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDesc() != null ? getDesc().hashCode() : 0);
        result = 31 * result + getCount();
        result = 31 * result + (getPrice() != +0.0f ? Float.floatToIntBits(getPrice()) : 0);
        result = 31 * result + getSum();
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("goodsId：").append(goodsId).append('\n');
        stringbuilder.append("picPath：").append(picPath).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        stringbuilder.append("desc：").append(desc).append('\n');
        stringbuilder.append("count：").append(count).append('\n');
        stringbuilder.append("price：").append(price).append('\n');
        stringbuilder.append("sum：").append(sum).append('\n');
        return stringbuilder.toString();
    }
}
