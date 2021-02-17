package Example6_6;

public class AdvertisementBoard {
    public void show(Advertisement adver){      //负责创建广告牌
        System.out.println(adver.getCorpName()+"的广告词如下：");
        adver.showAdvertisement();      //接口回调
    }
}
