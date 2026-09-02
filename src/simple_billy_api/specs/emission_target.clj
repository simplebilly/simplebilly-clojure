(ns simple-billy-api.specs.emission-target
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.emission-target-scope :refer :all]
            )
  (:import (java.io File)))


(def emission-target-data
  {
   (ds/req :baseValue) string?
   (ds/req :baseYear) int?
   (ds/req :description) string?
   (ds/req :scope) emission-target-scope-spec
   (ds/req :targetValue) string?
   (ds/req :targetYear) int?
   (ds/opt :updatedAt) inst?
   })

(def emission-target-spec
  (ds/spec
    {:name ::emission-target
     :spec emission-target-data}))
