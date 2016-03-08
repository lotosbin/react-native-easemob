package com.huanxin;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.shell.MainReactPackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/24.
 */
public class HXPackage extends MainReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new HXModule(reactContext));
        return modules;
    }
}
