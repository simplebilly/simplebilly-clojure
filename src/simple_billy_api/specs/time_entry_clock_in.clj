(ns simple-billy-api.specs.time-entry-clock-in
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def time-entry-clock-in-data
  {
   (ds/opt :notes) string?
   })

(def time-entry-clock-in-spec
  (ds/spec
    {:name ::time-entry-clock-in
     :spec time-entry-clock-in-data}))
