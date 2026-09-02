(ns simple-billy-api.specs.plugin-error-one-of-1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-error-one-of-1-data
  {
   (ds/req :NotFound) (s/coll-of any?)
   })

(def plugin-error-one-of-1-spec
  (ds/spec
    {:name ::plugin-error-one-of-1
     :spec plugin-error-one-of-1-data}))
