(ns simple-billy-api.specs.target-progress
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def target-progress-data
  {
   (ds/req :base_value) float?
   (ds/req :base_year) int?
   (ds/req :description) string?
   (ds/req :id) uuid?
   (ds/opt :progress_pct) float?
   (ds/req :scope) string?
   (ds/req :target_value) float?
   (ds/req :target_year) int?
   })

(def target-progress-spec
  (ds/spec
    {:name ::target-progress
     :spec target-progress-data}))
