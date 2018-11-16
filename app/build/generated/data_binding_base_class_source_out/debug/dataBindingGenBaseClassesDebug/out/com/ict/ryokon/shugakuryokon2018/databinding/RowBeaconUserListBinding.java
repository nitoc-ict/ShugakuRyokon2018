package com.ict.ryokon.shugakuryokon2018.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ict.ryokon.shugakuryokon2018.model.UserData;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowBeaconUserListBinding extends ViewDataBinding {
  @NonNull
  public final TextView attendNumText;

  @NonNull
  public final TextView mainText;

  @NonNull
  public final TextView minorText;

  @NonNull
  public final TextView subText;

  @Bindable
  protected UserData mUserdata;

  protected RowBeaconUserListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView attendNumText, TextView mainText, TextView minorText, TextView subText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.attendNumText = attendNumText;
    this.mainText = mainText;
    this.minorText = minorText;
    this.subText = subText;
  }

  public abstract void setUserdata(@Nullable UserData userdata);

  @Nullable
  public UserData getUserdata() {
    return mUserdata;
  }

  @NonNull
  public static RowBeaconUserListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_beacon_user_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowBeaconUserListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowBeaconUserListBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.row_beacon_user_list, root, attachToRoot, component);
  }

  @NonNull
  public static RowBeaconUserListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_beacon_user_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowBeaconUserListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowBeaconUserListBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.row_beacon_user_list, null, false, component);
  }

  public static RowBeaconUserListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RowBeaconUserListBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowBeaconUserListBinding)bind(component, view, com.ict.ryokon.shugakuryokon2018.R.layout.row_beacon_user_list);
  }
}
