package com.ict.ryokon.shugakuryokon2018.ui.setting.target;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class RollCallTargetSettingFragmentDirections {
  @NonNull
  public static ActionRollCallTargetSettingFragmentToRollCallFragment actionRollCallTargetSettingFragmentToRollCallFragment() {
    return new ActionRollCallTargetSettingFragmentToRollCallFragment();
  }

  public static class ActionRollCallTargetSettingFragmentToRollCallFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    public ActionRollCallTargetSettingFragmentToRollCallFragment() {
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
      return com.ict.ryokon.shugakuryokon2018.R.id.action_rollCallTargetSettingFragment_to_rollCallFragment;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionRollCallTargetSettingFragmentToRollCallFragment that = (ActionRollCallTargetSettingFragmentToRollCallFragment) object;
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
      return "ActionRollCallTargetSettingFragmentToRollCallFragment(actionId=" + getActionId() + "){"
          + "}";
    }
  }
}
