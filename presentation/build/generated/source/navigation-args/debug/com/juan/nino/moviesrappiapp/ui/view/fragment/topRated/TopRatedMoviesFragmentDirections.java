package com.juan.nino.moviesrappiapp.ui.view.fragment.topRated;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.juan.nino.moviesrappiapp.R;
import com.juan.nino.moviesrappiapp.model.MovieModel;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TopRatedMoviesFragmentDirections {
  private TopRatedMoviesFragmentDirections() {
  }

  @NonNull
  public static ActionDetail actionDetail(@NonNull MovieModel movie) {
    return new ActionDetail(movie);
  }

  public static class ActionDetail implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionDetail(@NonNull MovieModel movie) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
    }

    @NonNull
    public ActionDetail setMovie(@NonNull MovieModel movie) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("movie")) {
        MovieModel movie = (MovieModel) arguments.get("movie");
        if (Parcelable.class.isAssignableFrom(MovieModel.class) || movie == null) {
          __result.putParcelable("movie", Parcelable.class.cast(movie));
        } else if (Serializable.class.isAssignableFrom(MovieModel.class)) {
          __result.putSerializable("movie", Serializable.class.cast(movie));
        } else {
          throw new UnsupportedOperationException(MovieModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.actionDetail;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public MovieModel getMovie() {
      return (MovieModel) arguments.get("movie");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDetail that = (ActionDetail) object;
      if (arguments.containsKey("movie") != that.arguments.containsKey("movie")) {
        return false;
      }
      if (getMovie() != null ? !getMovie().equals(that.getMovie()) : that.getMovie() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getMovie() != null ? getMovie().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDetail(actionId=" + getActionId() + "){"
          + "movie=" + getMovie()
          + "}";
    }
  }
}
