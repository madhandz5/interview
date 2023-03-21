package me.ryan.interview.factory.framework;

/**
 * packageName      : me.ryan.interview.factory.framework
 * fileName          : AbsItemCreater
 * author           : ryan
 * date             : 2023/03/21
 * description      :
 * =====================================================
 * DATE               AUTHOR                NOTE
 * -----------------------------------------------------
 * 2023/03/21          ryan       최초 생성
 */
public abstract class AbsItemCreator {

    public Item create() {
        Item item;
        requestItemsInfo();
        item = createItem();
        createItemLog();
        return item;
    }


//   생성 전 DB 에서 정보 요청
    abstract protected void requestItemsInfo();

//    생성 후 어뷰징 방지를 위한 아이템 생성정보 전달
    abstract protected void createItemLog();

//    아이템 생성
    abstract protected Item createItem();

}


