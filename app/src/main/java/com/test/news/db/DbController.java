package com.test.news.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.test.news.db.gen.CollectionDao;
import com.test.news.db.gen.DaoMaster;
import com.test.news.db.gen.DaoSession;

import java.util.List;

// TODO: 收藏管理类
public class DbController {
    /**
     * Helper
     */
    private DaoMaster.DevOpenHelper mHelper;//获取Helper对象
    /**
     * 数据库
     */
    private SQLiteDatabase db;
    /**
     * DaoMaster
     */
    private DaoMaster mDaoMaster;
    /**
     * DaoSession
     */
    private DaoSession mDaoSession;
    /**
     * 上下文
     */
    private Context context;
    /**
     * dao
     */
    private CollectionDao collectionDao;

    private static DbController mDbController;

    /**
     * 获取单例
     */
    public static DbController getInstance(Context context) {
        if (mDbController == null) {
            synchronized (DbController.class) {
                if (mDbController == null) {
                    mDbController = new DbController(context);
                }
            }
        }
        return mDbController;
    }

    /**
     * 初始化
     *
     * @param context
     */
    public DbController(Context context) {
        this.context = context;
        mHelper = new DaoMaster.DevOpenHelper(context, "new.db", null);
        mDaoMaster = new DaoMaster(getWritableDatabase());
        mDaoSession = mDaoMaster.newSession();
        collectionDao = mDaoSession.getCollectionDao();
    }

    /**
     * 获取可读数据库
     */
    private SQLiteDatabase getReadableDatabase() {
        if (mHelper == null) {
            mHelper = new DaoMaster.DevOpenHelper(context, "new.db", null);
        }
        SQLiteDatabase db = mHelper.getReadableDatabase();
        return db;
    }

    /**
     * 获取可写数据库
     *
     * @return
     */
    private SQLiteDatabase getWritableDatabase() {
        if (mHelper == null) {
            mHelper = new DaoMaster.DevOpenHelper(context, "new.db", null);
        }
        SQLiteDatabase db = mHelper.getWritableDatabase();
        return db;
    }

    /**
     * @param title
     * @return
     */
    public boolean isExist(String title) {
        Collection collection = collectionDao.queryBuilder().where(CollectionDao.Properties.Title.eq(title)).build().unique();
        return collection == null ? false : true;
    }


    /**
     * 会自动判定是插入还是替换
     *
     * @param collection
     */
    public void insertOrReplace(Collection collection) {
        collectionDao.insertOrReplace(collection);
    }

    /**
     * 查询所有数据
     */
    public List<Collection> searchAll() {
        List<Collection> videos = collectionDao.queryBuilder().list();
        return videos;
    }

    /**
     * 删除数据
     */
    public void delete(String title) {
        collectionDao.queryBuilder().where(CollectionDao.Properties.Title.eq(title)).buildDelete().executeDeleteWithoutDetachingEntities();
    }
}