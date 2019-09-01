package com.juan.nino.moviesrappiapp.ui.view.fragment.detail;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.juan.nino.moviesrappiapp.model.MovieModel;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailMovieFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailMovieFragmentArgs() {
  }

  private DetailMovieFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailMovieFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailMovieFragmentArgs __result = new DetailMovieFragmentArgs();
    bundle.setClassLoader(DetailMovieFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("movie")) {
      MovieModel movie;
      if (Parcelable.class.isAssignableFrom(MovieModel.class) || Serializable.class.isAssignableFrom(MovieModel.class)) {
        movie = (MovieModel) bundle.get("movie");
      } else {
        throw new UnsupportedOperationException(MovieModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("movie", movie);
    } else {
      throw new IllegalArgumentException("Required argument \"movie\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public MovieModel getMovie() {
    return (MovieModel) arguments.get("movie");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailMovieFragmentArgs that = (DetailMovieFragmentArgs) object;
    if (arguments.containsKey("movie") != that.arguments.containsKey("movie")) {
      return false;
    }
    if (getMovie() != null ? !getMovie().equals(that.getMovie()) : that.getMovie() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getMovie() != null ? getMovie().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailMovieFragmentArgs{"
        + "movie=" + getMovie()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailMovieFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull MovieModel movie) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
    }

    @NonNull
    public DetailMovieFragmentArgs build() {
      DetailMovieFragmentArgs result = new DetailMovieFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMovie(@NonNull MovieModel movie) {
      if (movie == null) {
        throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("movie", movie);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public MovieModel getMovie() {
      return (MovieModel) arguments.get("movie");
    }
  }
}
