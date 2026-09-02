(ns simple-billy-api.specs.emission-entry
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.emission-method :refer :all]
            [simple-billy-api.specs.ghg-scope :refer :all]
            )
  (:import (java.io File)))


(def emission-entry-data
  {
   (ds/req :activityValue) string?
   (ds/req :categoryId) string?
   (ds/req :description) string?
   (ds/req :efSource) string?
   (ds/req :efVersion) string?
   (ds/req :method) emission-method-spec
   (ds/req :scope) ghg-scope-spec
   (ds/req :tco2e) string?
   (ds/req :unit) string?
   (ds/opt :updatedAt) inst?
   (ds/req :year) int?
   })

(def emission-entry-spec
  (ds/spec
    {:name ::emission-entry
     :spec emission-entry-data}))
