(ns simple-billy-api.specs.config-field-kind-one-of-3
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def config-field-kind-one-of-3-data
  {
   (ds/req :options) (s/coll-of string?)
   (ds/req :type) string?
   })

(def config-field-kind-one-of-3-spec
  (ds/spec
    {:name ::config-field-kind-one-of-3
     :spec config-field-kind-one-of-3-data}))
