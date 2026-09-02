(ns simple-billy-api.specs.config-field-kind-one-of-4
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def config-field-kind-one-of-4-data
  {
   (ds/req :type) string?
   })

(def config-field-kind-one-of-4-spec
  (ds/spec
    {:name ::config-field-kind-one-of-4
     :spec config-field-kind-one-of-4-data}))
