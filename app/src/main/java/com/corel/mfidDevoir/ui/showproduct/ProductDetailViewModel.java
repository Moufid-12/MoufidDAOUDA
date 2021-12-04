package com.corel.mfidDevoir.ui.showproduct;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

import com.corel.mfidDevoir.dao.DataBaseRoom;
import com.corel.mfidDevoir.dao.ProductRoomDao;
import com.corel.mfidDevoir.entites.Product;
import com.corel.mfidDevoir.webservices.ProductWebService;

public class ProductDetailViewModel extends AndroidViewModel {
    // TODO: Implement the ViewModel

    private final ProductRoomDao productRoomDao;

    public ProductDetailViewModel(Application application) {
        super(application);
        productRoomDao = DataBaseRoom.getInstance(application).productRoomDao();
    }

    public void deleteProduct(Product product){
        new Thread(() -> {
            ProductWebService productWebService = new ProductWebService();

            productRoomDao.delete(product);
        }).start();
    }
}