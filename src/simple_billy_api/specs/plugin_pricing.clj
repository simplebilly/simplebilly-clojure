(ns simple-billy-api.specs.plugin-pricing
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-pricing-data
  {
   (ds/req :type) string?
   (ds/req :price) float?
   (ds/req :price_per_month) float?
   })

(def plugin-pricing-spec
  (ds/spec
    {:name ::plugin-pricing
     :spec plugin-pricing-data}))
