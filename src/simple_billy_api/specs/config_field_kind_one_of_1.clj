(ns simple-billy-api.specs.config-field-kind-one-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def config-field-kind-one-of-1-data
  {
   (ds/req :type) string?
   })

(def config-field-kind-one-of-1-spec
  (ds/spec
    {:name ::config-field-kind-one-of-1
     :spec config-field-kind-one-of-1-data}))
