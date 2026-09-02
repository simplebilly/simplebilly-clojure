(ns simple-billy-api.specs.emission-factor-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def emission-factor-response-data
  {
   (ds/req :category_id) string?
   (ds/req :kg_co2e_per_unit) float?
   (ds/req :name_de) string?
   (ds/req :source) string?
   (ds/req :unit) string?
   (ds/req :version) string?
   })

(def emission-factor-response-spec
  (ds/spec
    {:name ::emission-factor-response
     :spec emission-factor-response-data}))
