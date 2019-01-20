package com.ict.ryokon.shugakuryokon2018.ui.rollcall;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RollCallFragmentDirections {
  @NonNull
  public static ActionRollCallFragmentToRollCallTargetSettingFragment actionRollCallFragmentToRollCallTargetSettingFragment() {
    return new ActionRollCallFragmentToRollCallTargetSettingFragment();
  }

  @NonNull
  public static ActionRollCallFragmentToBeaconUserListFragment actionRollCallFragmentToBeaconUserListFragment() {
    return new ActionRollCallFragmentToBeaconUserListFragment();
  }

  public static class ActionRollCallFragmentToRollCallTargetSettingFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    public ActionRollCallFragmentToRollCallTargetSettingFragment() {
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
      return com.ict.ryokon.shugakuryokon2018.R.id.action_rollCallFragment_to_rollCallTargetSettingFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionRollCallFragmentToRollCallTargetSettingFragment that = (ActionRollCallFragmentToRollCallTargetSettingFragment) object;
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
      return "ActionRollCallFragmentToRollCallTargetSettingFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }

  public static class ActionRollCallFragmentToBeaconUserListFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    public ActionRollCallFragmentToBeaconUserListFragment() {
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
      return com.ict.ryokon.shugakuryokon2018.R.id.action_rollCallFragment_to_beaconUserListFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionRollCallFragmentToBeaconUserListFragment that = (ActionRollCallFragmentToBeaconUserListFragment) object;
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
      return "ActionRollCallFragmentToBeaconUserListFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
