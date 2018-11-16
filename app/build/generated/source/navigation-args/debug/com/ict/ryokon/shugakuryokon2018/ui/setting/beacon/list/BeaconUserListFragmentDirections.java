package com.ict.ryokon.shugakuryokon2018.ui.setting.beacon.list;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class BeaconUserListFragmentDirections {
  @NonNull
  public static ActionBeaconUserListFragmentToBeaconSettingFragment actionBeaconUserListFragmentToBeaconSettingFragment(int userAttendNum) {
    return new ActionBeaconUserListFragmentToBeaconSettingFragment(userAttendNum);
  }

  @NonNull
  public static ActionBeaconUserListFragmentToRollCallFragment actionBeaconUserListFragmentToRollCallFragment() {
    return new ActionBeaconUserListFragmentToRollCallFragment();
  }

  public static class ActionBeaconUserListFragmentToBeaconSettingFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    public ActionBeaconUserListFragmentToBeaconSettingFragment(int userAttendNum) {
      this.arguments.put("userAttendNum", userAttendNum);
    }

    @NonNull
    public ActionBeaconUserListFragmentToBeaconSettingFragment setUserAttendNum(int userAttendNum) {
      this.arguments.put("userAttendNum", userAttendNum);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("userAttendNum")) {
        int userAttendNum = (int) arguments.get("userAttendNum");
        __result.putInt("userAttendNum", userAttendNum);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return com.ict.ryokon.shugakuryokon2018.R.id.action_beaconUserListFragment_to_beaconSettingFragment;
    }

    @SuppressWarnings("unchecked")
    public int getUserAttendNum() {
      return (int) arguments.get("userAttendNum");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionBeaconUserListFragmentToBeaconSettingFragment that = (ActionBeaconUserListFragmentToBeaconSettingFragment) object;
      if (arguments.containsKey("userAttendNum") != that.arguments.containsKey("userAttendNum")) {
        return false;
      }
      if (getUserAttendNum() != that.getUserAttendNum()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getUserAttendNum();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionBeaconUserListFragmentToBeaconSettingFragment(actionId=" + getActionId() + "){"
          + "userAttendNum=" + getUserAttendNum()
          + "}";
    }
  }

  public static class ActionBeaconUserListFragmentToRollCallFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    public ActionBeaconUserListFragmentToRollCallFragment() {
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      return __result;
    }

    @Override
    public int getActionId() {
      return com.ict.ryokon.shugakuryokon2018.R.id.action_beaconUserListFragment_to_rollCallFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionBeaconUserListFragmentToRollCallFragment that = (ActionBeaconUserListFragmentToRollCallFragment) object;
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionBeaconUserListFragmentToRollCallFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
