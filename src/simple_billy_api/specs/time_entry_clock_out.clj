(ns simple-billy-api.specs.time-entry-clock-out
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def time-entry-clock-out-data
  {
   (ds/req :clock_out) inst?
   (ds/opt :hours) string?
   })

(def time-entry-clock-out-spec
  (ds/spec
    {:name ::time-entry-clock-out
     :spec time-entry-clock-out-data}))
