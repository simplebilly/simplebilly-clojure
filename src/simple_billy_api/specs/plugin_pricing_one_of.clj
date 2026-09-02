(ns simple-billy-api.specs.plugin-pricing-one-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-pricing-one-of-data
  {
   (ds/req :type) string?
   })

(def plugin-pricing-one-of-spec
  (ds/spec
    {:name ::plugin-pricing-one-of
     :spec plugin-pricing-one-of-data}))
