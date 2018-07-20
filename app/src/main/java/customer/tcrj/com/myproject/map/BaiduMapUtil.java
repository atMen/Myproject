package customer.tcrj.com.myproject.map;

import android.os.Bundle;

import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.PolylineOptions;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.qyListInfo;

/**
 * Created by leict on 2018/7/20.
 */

public class BaiduMapUtil {
    /**
     * 绘制Marker，地图上常见的类似气球形状的图层
     * new LatLng( Double.valueOf(mapLocationBean.getLat()),Double.valueOf(mapLocationBean.getLng()))
     */
    public MarkerOptions setMarker(qyListInfo.DataBean mapLocationBean) {

        return setMarker(mapLocationBean,R.drawable.map_icon);
    }


    public MarkerOptions setMarker(qyListInfo.DataBean mapLocationBean, int drawableId) {
        MarkerOptions markerOptions = new MarkerOptions();//参数设置类
        markerOptions.position(new LatLng( Double.valueOf(mapLocationBean.getLat()),Double.valueOf(mapLocationBean.getLng())));//marker坐标位置
        markerOptions.icon(BitmapDescriptorFactory
                .fromResource(drawableId));//marker图标，可以自定义
        markerOptions.draggable(false);//是否可拖拽，默认不可拖拽
        markerOptions.anchor(0.5f, 1.0f);//设置 marker覆盖物与位置点的位置关系，默认（0.5f, 1.0f）水平居中，垂直下对齐
        markerOptions.alpha(1.0f);//marker图标透明度，0~1.0，默认为1.0
        markerOptions.animateType(MarkerOptions.MarkerAnimateType.none);//marker出现的方式，从天上掉下
        markerOptions.flat(false);//marker突变是否平贴地面
        markerOptions.zIndex(1);//index
        Bundle bundle = new Bundle();
        bundle.putString("title",mapLocationBean.getQYMC());
        bundle.putString("address",mapLocationBean.getZCDZ());
        markerOptions.extraInfo(bundle);
        return markerOptions;
    }

    /**
     * 绘制折线
     */
    public PolylineOptions Polyline(List<LatLng> points) {
        PolylineOptions polylineOptions = new PolylineOptions();//参数设置类
        polylineOptions.width(10);//宽度,单位：像素
        polylineOptions.color(0xAAFF0000);//设置折线颜色
        polylineOptions.points(points);//折线顶点坐标集
        return polylineOptions;
    }

    /**
     * 多个点，在Android里面显示合理的缩放级
     */
    public MapStatusUpdate setLatLngBounds(List<qyListInfo.DataBean> points, MapView mMapView) {
        LatLngBounds.Builder builder2 = new LatLngBounds.Builder();
        for (qyListInfo.DataBean p : points) {
            builder2 = builder2.include(new LatLng( Double.valueOf(p.getLat()),Double.valueOf(p.getLng())));
        }
        LatLngBounds latlngBounds = builder2.build();
        MapStatusUpdate u = MapStatusUpdateFactory.newLatLngBounds(latlngBounds, mMapView.getWidth(), mMapView.getHeight());
        return u;
    }



}
