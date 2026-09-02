(ns simple-billy-api.specs.create-emission-entry
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-emission-entry-data
  {
   (ds/req :activity_value) string?
   (ds/req :category_id) string?
   (ds/req :description) string?
   (ds/req :method) string?
   (ds/req :scope) string?
   (ds/req :unit) string?
   (ds/req :year) int?
   })

(def create-emission-entry-spec
  (ds/spec
    {:name ::create-emission-entry
     :spec create-emission-entry-data}))
