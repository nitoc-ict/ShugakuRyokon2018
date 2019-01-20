package com.ict.ryokon.shugakuryokon2018;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentBeaconSettingBindingImpl;
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentBeaconUserListBindingImpl;
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentRollCallBindingImpl;
import com.ict.ryokon.shugakuryokon2018.databinding.FragmentRollCallTargetSettingBindingImpl;
import com.ict.ryokon.shugakuryokon2018.databinding.RowBeaconUserListBindingImpl;
import com.ict.ryokon.shugakuryokon2018.databinding.RowRollCallBindingImpl;
import com.ict.ryokon.shugakuryokon2018.databinding.RowRollCallTargetSettingBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTBEACONSETTING = 1;

  private static final int LAYOUT_FRAGMENTBEACONUSERLIST = 2;

  private static final int LAYOUT_FRAGMENTROLLCALL = 3;

  private static final int LAYOUT_FRAGMENTROLLCALLTARGETSETTING = 4;

  private static final int LAYOUT_ROWBEACONUSERLIST = 5;

  private static final int LAYOUT_ROWROLLCALL = 6;

  private static final int LAYOUT_ROWROLLCALLTARGETSETTING = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ict.ryokon.shugakuryokon2018.R.layout.fragment_beacon_setting, LAYOUT_FRAGMENTBEACONSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ict.ryokon.shugakuryokon2018.R.layout.fragment_beacon_user_list, LAYOUT_FRAGMENTBEACONUSERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ict.ryokon.shugakuryokon2018.R.layout.fragment_roll_call, LAYOUT_FRAGMENTROLLCALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ict.ryokon.shugakuryokon2018.R.layout.fragment_roll_call_target_setting, LAYOUT_FRAGMENTROLLCALLTARGETSETTING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ict.ryokon.shugakuryokon2018.R.layout.row_beacon_user_list, LAYOUT_ROWBEACONUSERLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ict.ryokon.shugakuryokon2018.R.layout.row_roll_call, LAYOUT_ROWROLLCALL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ict.ryokon.shugakuryokon2018.R.layout.row_roll_call_target_setting, LAYOUT_ROWROLLCALLTARGETSETTING);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTBEACONSETTING: {
          if ("layout/fragment_beacon_setting_0".equals(tag)) {
            return new FragmentBeaconSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_beacon_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBEACONUSERLIST: {
          if ("layout/fragment_beacon_user_list_0".equals(tag)) {
            return new FragmentBeaconUserListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_beacon_user_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTROLLCALL: {
          if ("layout/fragment_roll_call_0".equals(tag)) {
            return new FragmentRollCallBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_roll_call is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTROLLCALLTARGETSETTING: {
          if ("layout/fragment_roll_call_target_setting_0".equals(tag)) {
            return new FragmentRollCallTargetSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_roll_call_target_setting is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWBEACONUSERLIST: {
          if ("layout/row_beacon_user_list_0".equals(tag)) {
            return new RowBeaconUserListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_beacon_user_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWROLLCALL: {
          if ("layout/row_roll_call_0".equals(tag)) {
            return new RowRollCallBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_roll_call is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWROLLCALLTARGETSETTING: {
          if ("layout/row_roll_call_target_setting_0".equals(tag)) {
            return new RowRollCallTargetSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_roll_call_target_setting is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "userdata");
      sKeys.put(2, "adapter");
      sKeys.put(3, "viewmodel");
      sKeys.put(4, "fabOnClick");
      sKeys.put(5, "bindingmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/fragment_beacon_setting_0", com.ict.ryokon.shugakuryokon2018.R.layout.fragment_beacon_setting);
      sKeys.put("layout/fragment_beacon_user_list_0", com.ict.ryokon.shugakuryokon2018.R.layout.fragment_beacon_user_list);
      sKeys.put("layout/fragment_roll_call_0", com.ict.ryokon.shugakuryokon2018.R.layout.fragment_roll_call);
      sKeys.put("layout/fragment_roll_call_target_setting_0", com.ict.ryokon.shugakuryokon2018.R.layout.fragment_roll_call_target_setting);
      sKeys.put("layout/row_beacon_user_list_0", com.ict.ryokon.shugakuryokon2018.R.layout.row_beacon_user_list);
      sKeys.put("layout/row_roll_call_0", com.ict.ryokon.shugakuryokon2018.R.layout.row_roll_call);
      sKeys.put("layout/row_roll_call_target_setting_0", com.ict.ryokon.shugakuryokon2018.R.layout.row_roll_call_target_setting);
    }
  }
}
