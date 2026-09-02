(ns simple-billy-api.specs.create-emission-target
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-emission-target-data
  {
   (ds/req :base_value) string?
   (ds/req :base_year) int?
   (ds/req :description) string?
   (ds/req :scope) string?
   (ds/req :target_value) string?
   (ds/req :target_year) int?
   })

(def create-emission-target-spec
  (ds/spec
    {:name ::create-emission-target
     :spec create-emission-target-data}))
