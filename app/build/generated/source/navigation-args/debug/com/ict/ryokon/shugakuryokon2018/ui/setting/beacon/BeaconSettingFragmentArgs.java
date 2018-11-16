package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class BeaconSettingFragmentArgs {
  private final HashMap arguments = new HashMap();

  private BeaconSettingFragmentArgs() {
  }

  private BeaconSettingFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static BeaconSettingFragmentArgs fromBundle(@NonNull Bundle bundle) {
    BeaconSettingFragmentArgs __result = new BeaconSettingFragmentArgs();
    bundle.setClassLoader(BeaconSettingFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("userAttendNum")) {
      int userAttendNum;
      userAttendNum = bundle.getInt("userAttendNum");
      __result.arguments.put("userAttendNum", userAttendNum);
    } else {
      throw new IllegalArgumentException("Required argument \"userAttendNum\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getUserAttendNum() {
    return (int) arguments.get("userAttendNum");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("userAttendNum")) {
      int userAttendNum = (int) arguments.get("userAttendNum");
      __result.putInt("userAttendNum", userAttendNum);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    BeaconSettingFragmentArgs that = (BeaconSettingFragmentArgs) object;
    if (arguments.containsKey("userAttendNum") != that.arguments.containsKey("userAttendNum")) {
      return false;
    }
    if (getUserAttendNum() != that.getUserAttendNum()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + getUserAttendNum();
    return result;
  }

  @Override
  public String toString() {
    return "BeaconSettingFragmentArgs{"
        + "userAttendNum=" + getUserAttendNum()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(BeaconSettingFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int userAttendNum) {
      this.arguments.put("userAttendNum", userAttendNum);
    }

    @NonNull
    public BeaconSettingFragmentArgs build() {
      BeaconSettingFragmentArgs result = new BeaconSettingFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setUserAttendNum(int userAttendNum) {
      this.arguments.put("userAttendNum", userAttendNum);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getUserAttendNum() {
      return (int) arguments.get("userAttendNum");
    }
  }
}
