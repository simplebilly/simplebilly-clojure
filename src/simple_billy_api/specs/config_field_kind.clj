(ns simple-billy-api.specs.config-field-kind
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def config-field-kind-data
  {
   (ds/req :type) string?
   (ds/req :options) (s/coll-of string?)
   })

(def config-field-kind-spec
  (ds/spec
    {:name ::config-field-kind
     :spec config-field-kind-data}))
