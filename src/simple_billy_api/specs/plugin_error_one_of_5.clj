(ns simple-billy-api.specs.plugin-error-one-of-5
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-error-one-of-5-data
  {
   (ds/req :ValidationError) (s/coll-of any?)
   })

(def plugin-error-one-of-5-spec
  (ds/spec
    {:name ::plugin-error-one-of-5
     :spec plugin-error-one-of-5-data}))
