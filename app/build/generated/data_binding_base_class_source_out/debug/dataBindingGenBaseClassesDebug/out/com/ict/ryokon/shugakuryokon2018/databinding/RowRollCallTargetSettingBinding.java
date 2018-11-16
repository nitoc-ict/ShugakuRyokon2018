package com.ict.ryokon.shugakuryokon2018.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.ict.ryokon.shugakuryokon2018.model.UserData;
import com.ict.ryokon.shugakuryokon2018.ui.setting.target.RollCallTargetSettingBindingModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowRollCallTargetSettingBinding extends ViewDataBinding {
  @NonNull
  public final TextView attendNumText;

  @NonNull
  public final TextView mainText;

  @NonNull
  public final TextView subText;

  @NonNull
  public final Switch targetSwitch;

  @Bindable
  protected UserData mUserdata;

  @Bindable
  protected RollCallTargetSettingBindingModel mBindingmodel;

  protected RowRollCallTargetSettingBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView attendNumText, TextView mainText, TextView subText,
      Switch targetSwitch) {
    super(_bindingComponent, _root, _localFieldCount);
    this.attendNumText = attendNumText;
    this.mainText = mainText;
    this.subText = subText;
    this.targetSwitch = targetSwitch;
  }

  public abstract void setUserdata(@Nullable UserData userdata);

  @Nullable
  public UserData getUserdata() {
    return mUserdata;
  }

  public abstract void setBindingmodel(@Nullable RollCallTargetSettingBindingModel bindingmodel);

  @Nullable
  public RollCallTargetSettingBindingModel getBindingmodel() {
    return mBindingmodel;
  }

  @NonNull
  public static RowRollCallTargetSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_roll_call_target_setting, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowRollCallTargetSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowRollCallTargetSettingBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.row_roll_call_target_setting, root, attachToRoot, component);
  }

  @NonNull
  public static RowRollCallTargetSettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_roll_call_target_setting, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowRollCallTargetSettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowRollCallTargetSettingBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.row_roll_call_target_setting, null, false, component);
  }

  public static RowRollCallTargetSettingBinding bind(@NonNull View view) {
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
  public static RowRollCallTargetSettingBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (RowRollCallTargetSettingBinding)bind(component, view, com.ict.ryokon.shugakuryokon2018.R.layout.row_roll_call_target_setting);
  }
}
