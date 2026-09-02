(ns simple-billy-api.specs.plugin-error-one-of-2
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def plugin-error-one-of-2-data
  {
   (ds/req :Unauthorized) (s/coll-of any?)
   })

(def plugin-error-one-of-2-spec
  (ds/spec
    {:name ::plugin-error-one-of-2
     :spec plugin-error-one-of-2-data}))
