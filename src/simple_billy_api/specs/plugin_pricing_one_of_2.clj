(ns simple-billy-api.specs.plugin-pricing-one-of-2
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-pricing-one-of-2-data
  {
   (ds/req :price_per_month) float?
   (ds/req :type) string?
   })

(def plugin-pricing-one-of-2-spec
  (ds/spec
    {:name ::plugin-pricing-one-of-2
     :spec plugin-pricing-one-of-2-data}))
