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

public abstract class RowRollCallBinding extends ViewDataBinding {
  @NonNull
  public final TextView attendNumber;

  @NonNull
  public final TextView nameKana;

  @NonNull
  public final TextView nameKanji;

  @Bindable
  protected UserData mUserdata;

  protected RowRollCallBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView attendNumber, TextView nameKana, TextView nameKanji) {
    super(_bindingComponent, _root, _localFieldCount);
    this.attendNumber = attendNumber;
    this.nameKana = nameKana;
    this.nameKanji = nameKanji;
  }

  public abstract void setUserdata(@Nullable UserData userdata);

  @Nullable
  public UserData getUserdata() {
    return mUserdata;
  }

  @NonNull
  public static RowRollCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_roll_call, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowRollCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowRollCallBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.row_roll_call, root, attachToRoot, component);
  }

  @NonNull
  public static RowRollCallBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_roll_call, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowRollCallBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowRollCallBinding>inflateInternal(inflater, com.ict.ryokon.shugakuryokon2018.R.layout.row_roll_call, null, false, component);
  }

  public static RowRollCallBinding bind(@NonNull View view) {
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
  public static RowRollCallBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowRollCallBinding)bind(component, view, com.ict.ryokon.shugakuryokon2018.R.layout.row_roll_call);
  }
}
